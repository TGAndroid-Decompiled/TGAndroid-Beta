package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class w2 implements Runnable {
    public final int f21713a;
    public final FileLoadOperation f21714b;
    public final FileLoadOperation.RequestInfo f21715c;

    public w2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f21713a = i10;
        this.f21714b = fileLoadOperation;
        this.f21715c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f21713a) {
            case 0:
                this.f21714b.lambda$startDownloadRequest$28(this.f21715c);
                return;
            default:
                this.f21714b.lambda$clearOperation$25(this.f21715c);
                return;
        }
    }
}
