package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class o2 implements Runnable {
    public final int f17955a;
    public final FileLoadOperation.RequestInfo f17956b;

    public o2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17955a = i10;
        this.f17956b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17955a) {
            case 0:
                FileLoadOperation.p(this.f17956b);
                return;
            default:
                FileLoadOperation.f(this.f17956b);
                return;
        }
    }
}
