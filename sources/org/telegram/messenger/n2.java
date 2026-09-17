package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18478a;
    public final FileLoadOperation.RequestInfo f18479b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18478a = i10;
        this.f18479b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18478a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$25(this.f18479b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$16(this.f18479b);
                return;
        }
    }
}
