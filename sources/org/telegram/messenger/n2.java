package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18621a;
    public final FileLoadOperation.RequestInfo f18622b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18621a = i10;
        this.f18622b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18621a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f18622b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f18622b);
                return;
        }
    }
}
