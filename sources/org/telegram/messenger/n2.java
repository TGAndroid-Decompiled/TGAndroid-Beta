package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f16826a;
    public final FileLoadOperation.RequestInfo f16827b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f16826a = i10;
        this.f16827b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f16826a) {
            case 0:
                FileLoadOperation.p(this.f16827b);
                return;
            default:
                FileLoadOperation.f(this.f16827b);
                return;
        }
    }
}
