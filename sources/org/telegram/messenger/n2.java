package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class n2 implements Runnable {
    public final int f18627a;
    public final FileLoadOperation.RequestInfo f18628b;

    public n2(FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18627a = i10;
        this.f18628b = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18627a) {
            case 0:
                FileLoadOperation.p(this.f18628b);
                return;
            default:
                FileLoadOperation.f(this.f18628b);
                return;
        }
    }
}
