package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f17055a;
    public final FileLoadOperation.RequestInfo f17056b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17055a = i10;
        this.f17056b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17055a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$25(this.f17056b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$16(this.f17056b);
                return;
        }
    }
}
