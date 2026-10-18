package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class q2 implements Runnable {
    public final int f19312a;
    public final FileLoadOperation.RequestInfo f19313b;

    public q2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19312a = i10;
        this.f19313b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19312a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f19313b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f19313b);
                return;
        }
    }
}
