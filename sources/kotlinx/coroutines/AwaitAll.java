package kotlinx.coroutines;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

public final class AwaitAll {
    public static final AtomicIntegerFieldUpdater notCompletedCount$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount$volatile");
    public final Deferred[] deferreds;
    private volatile int notCompletedCount$volatile;

    public final class AwaitAllNode extends JobNode {
        public static final AtomicReferenceFieldUpdater _disposer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer$volatile");
        private volatile Object _disposer$volatile;
        public final CancellableContinuationImpl continuation;
        public DisposableHandle handle;

        public AwaitAllNode(CancellableContinuationImpl cancellableContinuationImpl) {
            this.continuation = cancellableContinuationImpl;
        }

        @Override
        public final void invoke(Throwable th) {
            CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
            if (th != null) {
                cancellableContinuationImpl.getClass();
                Joiner joinerTryResumeImpl = cancellableContinuationImpl.tryResumeImpl(null, new CompletedExceptionally(th, false));
                if (joinerTryResumeImpl != null) {
                    cancellableContinuationImpl.completeResume(joinerTryResumeImpl);
                    DisposeHandlersOnCancel disposeHandlersOnCancel = (DisposeHandlersOnCancel) _disposer$volatile$FU.get(this);
                    if (disposeHandlersOnCancel != null) {
                        disposeHandlersOnCancel.disposeAll();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AwaitAll.notCompletedCount$volatile$FU;
            AwaitAll awaitAll = AwaitAll.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(awaitAll) == 0) {
                Deferred[] deferredArr = awaitAll.deferreds;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                cancellableContinuationImpl.resumeWith(arrayList);
            }
        }
    }

    public final class DisposeHandlersOnCancel implements CancelHandler {
        public final AwaitAllNode[] nodes;

        public DisposeHandlersOnCancel(AwaitAllNode[] awaitAllNodeArr) {
            this.nodes = awaitAllNodeArr;
        }

        public final void disposeAll() {
            for (AwaitAllNode awaitAllNode : this.nodes) {
                DisposableHandle disposableHandle = awaitAllNode.handle;
                if (disposableHandle == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handle");
                    throw null;
                }
                disposableHandle.dispose();
            }
        }

        @Override
        public final void invoke(Throwable th) {
            disposeAll();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    public AwaitAll(Deferred[] deferredArr) {
        this.deferreds = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }
}
