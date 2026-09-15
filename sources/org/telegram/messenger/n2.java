package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f16817a;
    public final FileLoadOperation.RequestInfo f16818b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f16817a = i10;
        this.f16818b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f16817a) {
            case 0:
                FileLoadOperation.p(this.f16818b);
                return;
            default:
                FileLoadOperation.f(this.f16818b);
                return;
        }
    }
}
