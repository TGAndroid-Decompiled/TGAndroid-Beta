package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f16999a;
    public final FileLoadOperation.RequestInfo f17000b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f16999a = i10;
        this.f17000b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f16999a) {
            case 0:
                FileLoadOperation.p(this.f17000b);
                return;
            default:
                FileLoadOperation.f(this.f17000b);
                return;
        }
    }
}
