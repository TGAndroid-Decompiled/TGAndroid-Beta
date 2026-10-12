package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f18740a;
    public final FileLoadOperation.RequestInfo f18741b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18740a = i10;
        this.f18741b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18740a) {
            case 0:
                FileLoadOperation.n(this.f18741b);
                return;
            default:
                FileLoadOperation.e(this.f18741b);
                return;
        }
    }
}
