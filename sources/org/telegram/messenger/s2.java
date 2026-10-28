package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f21166a;
    public final FileLoadOperation.RequestInfo f21167b;

    public s2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f21166a = i10;
        this.f21167b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f21166a) {
            case 0:
                FileLoadOperation.lambda$clearOperation$26(this.f21167b);
                return;
            default:
                FileLoadOperation.lambda$cancelRequests$17(this.f21167b);
                return;
        }
    }
}
