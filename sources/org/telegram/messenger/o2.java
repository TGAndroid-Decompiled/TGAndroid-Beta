package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class o2 implements Runnable {
    public final int f17978a;
    public final FileLoadOperation.RequestInfo f17979b;

    public o2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17978a = i10;
        this.f17979b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17978a) {
            case 0:
                FileLoadOperation.p(this.f17979b);
                return;
            default:
                FileLoadOperation.f(this.f17979b);
                return;
        }
    }
}
