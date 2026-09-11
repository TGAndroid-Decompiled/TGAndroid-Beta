package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18451a;
    public final FileLoadOperation.RequestInfo f18452b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18451a = i10;
        this.f18452b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18451a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$25(this.f18452b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$16(this.f18452b);
                return;
        }
    }
}
