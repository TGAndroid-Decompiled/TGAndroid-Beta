package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class q2 implements Runnable {
    public final int f19317a;
    public final FileLoadOperation.RequestInfo f19318b;

    public q2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19317a = i10;
        this.f19318b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19317a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f19318b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f19318b);
                return;
        }
    }
}
