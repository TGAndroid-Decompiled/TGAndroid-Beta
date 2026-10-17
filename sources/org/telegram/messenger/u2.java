package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class u2 implements Runnable {
    public final int f19613a;
    public final FileLoadOperation f19614b;
    public final FileLoadOperation.RequestInfo f19615c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19613a = i10;
        this.f19614b = fileLoadOperation;
        this.f19615c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19613a) {
            case 0:
                this.f19614b.lambda$startDownloadRequest$28(this.f19615c);
                return;
            default:
                this.f19614b.lambda$clearOperation$25(this.f19615c);
                return;
        }
    }
}
