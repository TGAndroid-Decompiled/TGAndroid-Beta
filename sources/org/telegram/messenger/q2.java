package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class q2 implements Runnable {
    public final int f19315a;
    public final FileLoadOperation.RequestInfo f19316b;

    public q2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19315a = i10;
        this.f19316b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19315a) {
            case 0:
                FileLoadOperation.n(this.f19316b);
                return;
            default:
                FileLoadOperation.e(this.f19316b);
                return;
        }
    }
}
