package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18434a;
    public final FileLoadOperation.RequestInfo f18435b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18434a = i10;
        this.f18435b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18434a) {
            case 0:
                FileLoadOperation.p(this.f18435b);
                return;
            default:
                FileLoadOperation.f(this.f18435b);
                return;
        }
    }
}
