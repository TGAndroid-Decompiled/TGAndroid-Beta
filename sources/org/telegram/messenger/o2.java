package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class o2 implements Runnable {
    public final int f19515a;
    public final FileLoadOperation.RequestInfo f19516b;

    public o2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19515a = i10;
        this.f19516b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19515a) {
            case 0:
                FileLoadOperation.p(this.f19516b);
                return;
            default:
                FileLoadOperation.f(this.f19516b);
                return;
        }
    }
}
