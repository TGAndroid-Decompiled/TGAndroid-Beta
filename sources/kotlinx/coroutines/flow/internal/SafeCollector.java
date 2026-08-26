package kotlinx.coroutines.flow.internal;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;

public final class SafeCollector extends ContinuationImpl implements FlowCollector {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final FlowCollector collector;
    public Continuation completion_;
    public CoroutineContext lastEmissionContext;

    public SafeCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(NoOpContinuation.INSTANCE, EmptyCoroutineContext.INSTANCE);
        this.collector = flowCollector;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, SafeCollector$collectContextSize$1.INSTANCE)).intValue();
    }

    @Override
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object objEmit = emit(continuation, obj);
            return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionContext(th, continuation.getContext());
            throw th;
        }
    }

    @Override
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.completion_;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable thM139exceptionOrNullimpl = Result.m139exceptionOrNullimpl(obj);
        if (thM139exceptionOrNullimpl != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(thM139exceptionOrNullimpl, getContext());
        }
        Continuation continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public final Object emit(Continuation continuation, Object obj) {
        Comparable comparable;
        String strSubstring;
        CoroutineContext context = continuation.getContext();
        JobKt.ensureActive(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            int i = 0;
            if (coroutineContext instanceof DownstreamExceptionContext) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((DownstreamExceptionContext) coroutineContext).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                Intrinsics.checkNotNullParameter(str, "<this>");
                List list = SequencesKt.toList(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str, 0));
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!StringsKt__StringsKt.isBlank((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    String str2 = (String) obj3;
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                list.size();
                int size2 = list.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list2) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        String str3 = (String) obj4;
                        if ((i == 0 || i == size2) && StringsKt__StringsKt.isBlank(str3)) {
                            strSubstring = null;
                        } else {
                            Intrinsics.checkNotNullParameter(str3, "<this>");
                            if (iIntValue >= 0) {
                                int length4 = str3.length();
                                if (iIntValue <= length4) {
                                    length4 = iIntValue;
                                }
                                strSubstring = str3.substring(length4);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(SurfaceContainer$$ExternalSyntheticOutline0.m(iIntValue, "Requested character count ", " is less than zero.").toString());
                            }
                        }
                        if (strSubstring != null) {
                            arrayList3.add(strSubstring);
                        }
                        i = i3;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                StringBuilder sb = new StringBuilder(length3);
                CollectionsKt.joinTo(arrayList3, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.fold(0, new Function2() {
                {
                    super(2);
                }

                @Override
                public final Object invoke(Object obj5, Object obj6) {
                    int iIntValue2 = ((Number) obj5).intValue();
                    CoroutineContext.Element element = (CoroutineContext.Element) obj6;
                    CoroutineContext.Key key = element.getKey();
                    CoroutineContext.Element element2 = this.$this_checkContext.collectContext.get(key);
                    if (key != Job.Key.$$INSTANCE) {
                        return Integer.valueOf(element != element2 ? Integer.MIN_VALUE : iIntValue2 + 1);
                    }
                    Job job = (Job) element2;
                    Job parent = (Job) element;
                    while (true) {
                        if (parent != null) {
                            if (parent == job || !(parent instanceof ScopeCoroutine)) {
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            parent = null;
                            break;
                        }
                    }
                    if (parent == job) {
                        if (job != null) {
                            iIntValue2++;
                        }
                        return Integer.valueOf(iIntValue2);
                    }
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                }
            })).intValue() == this.collectContextSize) {
                this.lastEmissionContext = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.completion_ = continuation;
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt.emitFun;
        FlowCollector flowCollector = this.collector;
        Intrinsics.checkNotNull(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        safeCollectorKt$emitFun$1.getClass();
        Object objEmit = flowCollector.emit(obj, this);
        if (!Intrinsics.areEqual(objEmit, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion_ = null;
        }
        return objEmit;
    }
}
