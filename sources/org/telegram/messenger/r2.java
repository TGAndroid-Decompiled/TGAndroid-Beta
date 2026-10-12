package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f18739a;
    public final FileLoadOperation.RequestInfo f18740b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18739a = i10;
        this.f18740b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18739a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f18740b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f18740b);
                return;
        }
    }
}
