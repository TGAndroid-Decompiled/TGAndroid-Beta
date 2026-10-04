package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18632a;
    public final FileLoadOperation.RequestInfo f18633b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18632a = i10;
        this.f18633b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18632a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$25(this.f18633b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$16(this.f18633b);
                return;
        }
    }
}
