package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class q2 implements Runnable {
    public final int f17855a;
    public final FileLoadOperation.RequestInfo f17856b;

    public q2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17855a = i10;
        this.f17856b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17855a) {
            case 0:
                FileLoadOperation.n(this.f17856b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f17856b);
                return;
        }
    }
}
