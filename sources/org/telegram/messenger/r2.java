package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19407a;
    public final FileLoadOperation.RequestInfo f19408b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19407a = i10;
        this.f19408b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19407a) {
            case 0:
                FileLoadOperation.n(this.f19408b);
                return;
            default:
                FileLoadOperation.e(this.f19408b);
                return;
        }
    }
}
