package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f17065a;
    public final FileLoadOperation.RequestInfo f17066b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17065a = i10;
        this.f17066b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17065a) {
            case 0:
                FileLoadOperation.p(this.f17066b);
                return;
            default:
                FileLoadOperation.f(this.f17066b);
                return;
        }
    }
}
