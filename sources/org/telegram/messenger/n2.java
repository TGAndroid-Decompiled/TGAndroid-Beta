package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f21015a;
    public final FileLoadOperation.RequestInfo f21016b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i9) {
        this.f21015a = i9;
        this.f21016b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f21015a) {
            case 0:
                FileLoadOperation.p(this.f21016b);
                return;
            default:
                FileLoadOperation.f(this.f21016b);
                return;
        }
    }
}
