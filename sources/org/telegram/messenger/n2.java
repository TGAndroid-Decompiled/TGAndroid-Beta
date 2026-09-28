package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f17064a;
    public final FileLoadOperation.RequestInfo f17065b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17064a = i10;
        this.f17065b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17064a) {
            case 0:
                FileLoadOperation.p(this.f17065b);
                return;
            default:
                FileLoadOperation.f(this.f17065b);
                return;
        }
    }
}
