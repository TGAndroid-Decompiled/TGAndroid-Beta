package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19416a;
    public final FileLoadOperation.RequestInfo f19417b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19416a = i10;
        this.f19417b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19416a) {
            case 0:
                FileLoadOperation.n(this.f19417b);
                return;
            default:
                FileLoadOperation.e(this.f19417b);
                return;
        }
    }
}
