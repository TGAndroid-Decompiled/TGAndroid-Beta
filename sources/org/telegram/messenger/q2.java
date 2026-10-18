package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class q2 implements Runnable {
    public final int f19320a;
    public final FileLoadOperation.RequestInfo f19321b;

    public q2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19320a = i10;
        this.f19321b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19320a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f19321b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f19321b);
                return;
        }
    }
}
