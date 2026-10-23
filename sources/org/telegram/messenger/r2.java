package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19370a;
    public final FileLoadOperation.RequestInfo f19371b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19370a = i10;
        this.f19371b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19370a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f19371b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f19371b);
                return;
        }
    }
}
