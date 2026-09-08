package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18461a;
    public final FileLoadOperation.RequestInfo f18462b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18461a = i10;
        this.f18462b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18461a) {
            case 0:
                FileLoadOperation.p(this.f18462b);
                return;
            default:
                FileLoadOperation.f(this.f18462b);
                return;
        }
    }
}
