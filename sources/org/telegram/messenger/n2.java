package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f17059a;
    public final FileLoadOperation.RequestInfo f17060b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17059a = i10;
        this.f17060b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17059a) {
            case 0:
                FileLoadOperation.p(this.f17060b);
                return;
            default:
                FileLoadOperation.f(this.f17060b);
                return;
        }
    }
}
