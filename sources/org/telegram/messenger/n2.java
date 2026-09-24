package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f17050a;
    public final FileLoadOperation.RequestInfo f17051b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17050a = i10;
        this.f17051b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17050a) {
            case 0:
                FileLoadOperation.p(this.f17051b);
                return;
            default:
                FileLoadOperation.f(this.f17051b);
                return;
        }
    }
}
