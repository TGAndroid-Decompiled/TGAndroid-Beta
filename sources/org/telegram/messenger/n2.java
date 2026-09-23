package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f16806a;
    public final FileLoadOperation.RequestInfo f16807b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f16806a = i10;
        this.f16807b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f16806a) {
            case 0:
                FileLoadOperation.p(this.f16807b);
                return;
            default:
                FileLoadOperation.f(this.f16807b);
                return;
        }
    }
}
