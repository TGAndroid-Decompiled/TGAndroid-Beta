package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f16813a;
    public final FileLoadOperation.RequestInfo f16814b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f16813a = i10;
        this.f16814b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f16813a) {
            case 0:
                FileLoadOperation.p(this.f16814b);
                return;
            default:
                FileLoadOperation.f(this.f16814b);
                return;
        }
    }
}
