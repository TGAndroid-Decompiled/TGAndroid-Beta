package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18577a;
    public final FileLoadOperation.RequestInfo f18578b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18577a = i10;
        this.f18578b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18577a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f18578b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f18578b);
                return;
        }
    }
}
