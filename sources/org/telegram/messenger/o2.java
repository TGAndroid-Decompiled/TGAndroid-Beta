package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class o2 implements Runnable {
    public final int f19517a;
    public final FileLoadOperation.RequestInfo f19518b;

    public o2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19517a = i10;
        this.f19518b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19517a) {
            case 0:
                FileLoadOperation.p(this.f19518b);
                return;
            default:
                FileLoadOperation.f(this.f19518b);
                return;
        }
    }
}
