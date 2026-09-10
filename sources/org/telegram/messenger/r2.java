package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f16187a;
    public final FileLoadOperation.RequestInfo f16188b;

    public r2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f16187a = i10;
        this.f16188b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f16187a) {
            case 0:
                FileLoadOperation.p(this.f16188b);
                return;
            default:
                FileLoadOperation.f(this.f16188b);
                return;
        }
    }
}
