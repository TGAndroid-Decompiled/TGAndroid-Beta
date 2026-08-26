package kotlinx.coroutines.internal;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.EventLoopImplPlatform;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.ThreadContextElement;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

public abstract class AtomicKt {
    public static final Joiner NO_DECISION = new Joiner("NO_DECISION", 2);
    public static final Joiner CLOSED = new Joiner("CLOSED", 2);
    public static final Joiner UNDEFINED = new Joiner("UNDEFINED", 2);
    public static final Joiner REUSABLE_CLAIMED = new Joiner("REUSABLE_CLAIMED", 2);
    public static final Joiner CONDITION_FALSE = new Joiner("CONDITION_FALSE", 2);
    public static final Joiner NO_THREAD_ELEMENTS = new Joiner("NO_THREAD_ELEMENTS", 2);

    public static final Object findSegmentInternal(Segment segment, long j, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (segment.id >= j && !segment.isRemoved()) {
                return segment;
            }
            Object obj = ConcurrentLinkedListNode._next$volatile$FU.get(segment);
            Joiner joiner = CLOSED;
            if (obj == joiner) {
                return joiner;
            }
            Segment segment2 = (Segment) ((ConcurrentLinkedListNode) obj);
            if (segment2 == null) {
                segment2 = (Segment) function2.invoke(Long.valueOf(segment.id + 1), segment);
                do {
                    atomicReferenceFieldUpdater = ConcurrentLinkedListNode._next$volatile$FU;
                    if (atomicReferenceFieldUpdater.compareAndSet(segment, null, segment2)) {
                        if (segment.isRemoved()) {
                            segment.remove();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(segment) == null);
            }
            segment = segment2;
        }
    }

    public static final Segment m148getSegmentimpl(Object obj) {
        if (obj != CLOSED) {
            return (Segment) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void handleUncaughtCoroutineException(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = CoroutineExceptionHandlerImplKt.platformExceptionHandlers.iterator();
        while (it.hasNext()) {
            try {
                ((AndroidExceptionPreHandler) it.next()).handleException(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ExceptionsKt.addSuppressed(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            ExceptionsKt.addSuppressed(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean m149isClosedimpl(Object obj) {
        return obj == CLOSED;
    }

    public static final Object m150plusFjFbRPM(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (!(obj instanceof ThreadState)) {
            Object objFold = coroutineContext.fold(null, ThreadContextKt$findOne$1.INSTANCE);
            Intrinsics.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            Fragment$$ExternalSyntheticOutline0.m(objFold);
            throw null;
        }
        ThreadState threadState = (ThreadState) obj;
        ThreadContextElement[] threadContextElementArr = threadState.elements;
        int length = threadContextElementArr.length - 1;
        if (length < 0) {
            return;
        }
        ThreadContextElement threadContextElement = threadContextElementArr[length];
        Intrinsics.checkNotNull(null);
        Object obj2 = threadState.values[length];
        throw null;
    }

    public static final void resumeCancellableWith(Object obj, Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            continuation.resumeWith(obj);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Throwable thM144exceptionOrNullimpl = Result.m144exceptionOrNullimpl(obj);
        Object completedExceptionally = thM144exceptionOrNullimpl == null ? obj : new CompletedExceptionally(thM144exceptionOrNullimpl, false);
        ContinuationImpl continuationImpl = dispatchedContinuation.continuation;
        continuationImpl.getContext();
        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.dispatcher;
        if (coroutineDispatcher.isDispatchNeeded()) {
            dispatchedContinuation._state = completedExceptionally;
            dispatchedContinuation.resumeMode = 1;
            coroutineDispatcher.dispatch(continuationImpl.getContext(), dispatchedContinuation);
            return;
        }
        EventLoopImplPlatform eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.useCount >= 4294967296L) {
            dispatchedContinuation._state = completedExceptionally;
            dispatchedContinuation.resumeMode = 1;
            ArrayDeque arrayDeque = eventLoop$kotlinx_coroutines_core.unconfinedQueue;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                eventLoop$kotlinx_coroutines_core.unconfinedQueue = arrayDeque;
            }
            arrayDeque.addLast(dispatchedContinuation);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            Job job = (Job) continuationImpl.getContext().get(Job.Key.$$INSTANCE);
            if (job == null || job.isActive()) {
                Object obj2 = dispatchedContinuation.countOrElement;
                CoroutineContext context = continuationImpl.getContext();
                Object objUpdateThreadContext = updateThreadContext(context, obj2);
                UndispatchedCoroutine undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != NO_THREAD_ELEMENTS ? JobKt.updateUndispatchedCompletion(continuationImpl, context, objUpdateThreadContext) : null;
                try {
                    continuationImpl.resumeWith(obj);
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        restoreThreadContext(context, objUpdateThreadContext);
                    }
                } catch (Throwable th) {
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        restoreThreadContext(context, objUpdateThreadContext);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationException = job.getCancellationException();
                dispatchedContinuation.cancelCompletedResult$kotlinx_coroutines_core(completedExceptionally, cancellationException);
                dispatchedContinuation.resumeWith(ResultKt.createFailure(cancellationException));
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
        } catch (Throwable th2) {
            try {
                dispatchedContinuation.handleFatalException$kotlinx_coroutines_core(th2, null);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    public static final long systemProp(String str, long j, long j2, long j3) {
        String property;
        Long lValueOf;
        byte b;
        boolean z;
        long j4;
        long j5;
        int iDigit;
        long j6;
        long j7;
        int i = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        int length = property.length();
        if (length != 0) {
            int i2 = 0;
            char cCharAt = property.charAt(0);
            if (cCharAt < '0') {
                b = -1;
            } else {
                b = cCharAt == '0' ? (byte) 0 : (byte) 1;
            }
            long j8 = -9223372036854775807L;
            if (b < 0) {
                if (length != 1) {
                    if (cCharAt == '+') {
                        i2 = 1;
                        z = false;
                        j4 = 0;
                        j5 = -256204778801521550L;
                        while (true) {
                            if (i2 >= length) {
                                if (!z) {
                                    j4 = -j4;
                                }
                                lValueOf = Long.valueOf(j4);
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i2), 10);
                            if (iDigit >= 0) {
                                if (j4 < j5) {
                                    if (j5 == -256204778801521550L) {
                                        j5 = j8 / ((long) 10);
                                        if (j4 < j5) {
                                        }
                                    }
                                }
                                j6 = j4 * ((long) 10);
                                j7 = iDigit;
                                if (j6 >= j8 + j7) {
                                    j4 = j6 - j7;
                                    i2++;
                                    length = length;
                                }
                            }
                        }
                    } else if (cCharAt == '-') {
                        j8 = Long.MIN_VALUE;
                        i2 = 1;
                        z = true;
                        j4 = 0;
                        j5 = -256204778801521550L;
                        while (true) {
                            if (i2 >= length) {
                                if (!z) {
                                    j4 = -j4;
                                }
                                lValueOf = Long.valueOf(j4);
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i2), 10);
                            if (iDigit >= 0) {
                                if (j4 < j5) {
                                    if (j5 == -256204778801521550L) {
                                        j5 = j8 / ((long) 10);
                                        if (j4 < j5) {
                                        }
                                    }
                                }
                                j6 = j4 * ((long) 10);
                                j7 = iDigit;
                                if (j6 >= j8 + j7) {
                                    j4 = j6 - j7;
                                    i2++;
                                    length = length;
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else {
                z = false;
                j4 = 0;
                j5 = -256204778801521550L;
                while (true) {
                    if (i2 >= length) {
                        if (!z) {
                            j4 = -j4;
                        }
                        lValueOf = Long.valueOf(j4);
                        break;
                    }
                    iDigit = Character.digit((int) property.charAt(i2), 10);
                    if (iDigit >= 0) {
                        if (j4 < j5) {
                            if (j5 == -256204778801521550L) {
                                j5 = j8 / ((long) 10);
                                if (j4 < j5) {
                                }
                            }
                        }
                        j6 = j4 * ((long) 10);
                        j7 = iDigit;
                        if (j6 >= j8 + j7) {
                            j4 = j6 - j7;
                            i2++;
                            length = length;
                        }
                    }
                }
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int systemProp$default(int i, int i2, String str) {
        return (int) systemProp(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object updateThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = coroutineContext.fold(0, ThreadContextKt$findOne$1.INSTANCE$1);
            Intrinsics.checkNotNull(obj);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new ThreadState(((Number) obj).intValue(), coroutineContext), ThreadContextKt$findOne$1.INSTANCE$2);
        }
        Fragment$$ExternalSyntheticOutline0.m(obj);
        throw null;
    }
}
