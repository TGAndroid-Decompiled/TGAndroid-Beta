package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f17040a;
    public final FileLoadOperation.RequestInfo f17041b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17040a = i10;
        this.f17041b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17040a) {
            case 0:
                FileLoadOperation.p(this.f17041b);
                return;
            default:
                FileLoadOperation.f(this.f17041b);
                return;
        }
    }
}
