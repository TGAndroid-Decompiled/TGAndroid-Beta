package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18622a;
    public final FileLoadOperation.RequestInfo f18623b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18622a = i10;
        this.f18623b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18622a) {
            case 0:
                FileLoadOperation.p(this.f18623b);
                return;
            default:
                FileLoadOperation.f(this.f18623b);
                return;
        }
    }
}
