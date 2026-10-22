package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19346a;
    public final FileLoadOperation.RequestInfo f19347b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19346a = i10;
        this.f19347b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19346a) {
            case 0:
                FileLoadOperation.n(this.f19347b);
                return;
            default:
                FileLoadOperation.e(this.f19347b);
                return;
        }
    }
}
