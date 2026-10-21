package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19404a;
    public final FileLoadOperation.RequestInfo f19405b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19404a = i10;
        this.f19405b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19404a) {
            case 0:
                FileLoadOperation.n(this.f19405b);
                return;
            default:
                FileLoadOperation.e(this.f19405b);
                return;
        }
    }
}
