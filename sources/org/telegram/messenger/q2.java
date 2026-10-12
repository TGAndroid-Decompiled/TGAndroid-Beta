package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class q2 implements Runnable {
    public final int f18157a;
    public final FileLoadOperation.RequestInfo f18158b;

    public q2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18157a = i10;
        this.f18158b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18157a) {
            case 0:
                FileLoadOperation.n(this.f18158b);
                return;
            default:
                FileLoadOperation.e(this.f18158b);
                return;
        }
    }
}
