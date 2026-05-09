package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

final class AwaitAll {
    private static final AtomicIntegerFieldUpdater notCompletedCount$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount$volatile");
    private final Deferred[] deferreds;
    private volatile int notCompletedCount$volatile;

    public static final AtomicIntegerFieldUpdater getNotCompletedCount$volatile$FU() {
        return notCompletedCount$volatile$FU;
    }

    public AwaitAll(Deferred[] deferredArr) {
        this.deferreds = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    private final class DisposeHandlersOnCancel implements CancelHandler {
        private final AwaitAllNode[] nodes;

        public DisposeHandlersOnCancel(AwaitAllNode[] awaitAllNodeArr) {
            this.nodes = awaitAllNodeArr;
        }

        public final void disposeAll() {
            for (AwaitAllNode awaitAllNode : this.nodes) {
                awaitAllNode.getHandle().dispose();
            }
        }

        @Override
        public void invoke(Throwable th) {
            disposeAll();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    private final class AwaitAllNode extends JobNode {
        private static final AtomicReferenceFieldUpdater _disposer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer$volatile");
        private volatile Object _disposer$volatile;
        private final CancellableContinuation continuation;
        public DisposableHandle handle;

        public AwaitAllNode(CancellableContinuation cancellableContinuation) {
            this.continuation = cancellableContinuation;
        }

        public final DisposableHandle getHandle() {
            DisposableHandle disposableHandle = this.handle;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        public final void setHandle(DisposableHandle disposableHandle) {
            this.handle = disposableHandle;
        }

        public final DisposeHandlersOnCancel getDisposer() {
            return (DisposeHandlersOnCancel) _disposer$volatile$FU.get(this);
        }

        public final void setDisposer(DisposeHandlersOnCancel disposeHandlersOnCancel) {
            _disposer$volatile$FU.set(this, disposeHandlersOnCancel);
        }

        @Override
        public void invoke(Throwable th) {
            if (th != null) {
                Object objTryResumeWithException = this.continuation.tryResumeWithException(th);
                if (objTryResumeWithException != null) {
                    this.continuation.completeResume(objTryResumeWithException);
                    DisposeHandlersOnCancel disposer = getDisposer();
                    if (disposer != null) {
                        disposer.disposeAll();
                        return;
                    }
                    return;
                }
                return;
            }
            if (AwaitAll.getNotCompletedCount$volatile$FU().decrementAndGet(AwaitAll.this) == 0) {
                CancellableContinuation cancellableContinuation = this.continuation;
                Deferred[] deferredArr = AwaitAll.this.deferreds;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                cancellableContinuation.resumeWith(Result.m307constructorimpl(arrayList));
            }
        }
    }

    public final Object await(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        int length = this.deferreds.length;
        AwaitAllNode[] awaitAllNodeArr = new AwaitAllNode[length];
        for (int i = 0; i < length; i++) {
            Deferred deferred = this.deferreds[i];
            deferred.start();
            AwaitAllNode awaitAllNode = new AwaitAllNode(cancellableContinuationImpl);
            awaitAllNode.setHandle(JobKt__JobKt.invokeOnCompletion$default(deferred, false, false, awaitAllNode, 3, null));
            Unit unit = Unit.INSTANCE;
            awaitAllNodeArr[i] = awaitAllNode;
        }
        DisposeHandlersOnCancel disposeHandlersOnCancel = new DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i2 = 0; i2 < length; i2++) {
            awaitAllNodeArr[i2].setDisposer(disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl.isCompleted()) {
            disposeHandlersOnCancel.disposeAll();
        } else {
            CancellableContinuationKt.invokeOnCancellation(cancellableContinuationImpl, disposeHandlersOnCancel);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
