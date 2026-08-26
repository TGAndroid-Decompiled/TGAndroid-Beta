package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class JobImpl extends JobSupport {
    public final boolean handlesException;

    public JobImpl() {
        super(true);
        boolean z = true;
        initParentJob(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport._parentHandle$volatile$FU;
        ChildHandle childHandle = (ChildHandle) atomicReferenceFieldUpdater.get(this);
        ChildHandleNode childHandleNode = childHandle instanceof ChildHandleNode ? (ChildHandleNode) childHandle : null;
        if (childHandleNode == null) {
            z = false;
            break;
        }
        JobSupport job = childHandleNode.getJob();
        while (!job.getHandlesException$kotlinx_coroutines_core()) {
            ChildHandle childHandle2 = (ChildHandle) atomicReferenceFieldUpdater.get(job);
            ChildHandleNode childHandleNode2 = childHandle2 instanceof ChildHandleNode ? (ChildHandleNode) childHandle2 : null;
            if (childHandleNode2 == null) {
                z = false;
                break;
            }
            job = childHandleNode2.getJob();
        }
        this.handlesException = z;
    }

    @Override
    public final boolean getHandlesException$kotlinx_coroutines_core() {
        return this.handlesException;
    }

    @Override
    public final boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
