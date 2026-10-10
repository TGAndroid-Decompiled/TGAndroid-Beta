package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18581a;
    public final FileLoadOperation.RequestInfo f18582b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18581a = i10;
        this.f18582b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18581a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f18582b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f18582b);
                return;
        }
    }
}
