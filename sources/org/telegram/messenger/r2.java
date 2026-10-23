package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19439a;
    public final FileLoadOperation.RequestInfo f19440b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19439a = i10;
        this.f19440b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19439a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f19440b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f19440b);
                return;
        }
    }
}
