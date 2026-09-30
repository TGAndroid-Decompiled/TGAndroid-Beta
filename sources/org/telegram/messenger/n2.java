package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f17081a;
    public final FileLoadOperation.RequestInfo f17082b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17081a = i10;
        this.f17082b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17081a) {
            case 0:
                FileLoadOperation.p(this.f17082b);
                return;
            default:
                FileLoadOperation.f(this.f17082b);
                return;
        }
    }
}
