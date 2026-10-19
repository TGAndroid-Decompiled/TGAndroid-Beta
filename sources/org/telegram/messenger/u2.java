package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class u2 implements Runnable {
    public final int f19614a;
    public final FileLoadOperation f19615b;
    public final FileLoadOperation.RequestInfo f19616c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19614a = i10;
        this.f19615b = fileLoadOperation;
        this.f19616c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19614a) {
            case 0:
                this.f19615b.lambda$startDownloadRequest$28(this.f19616c);
                return;
            default:
                this.f19615b.lambda$clearOperation$25(this.f19616c);
                return;
        }
    }
}
