package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18631a;
    public final FileLoadOperation.RequestInfo f18632b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18631a = i10;
        this.f18632b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18631a) {
            case 0:
                FileLoadOperation.p(this.f18632b);
                return;
            default:
                FileLoadOperation.f(this.f18632b);
                return;
        }
    }
}
