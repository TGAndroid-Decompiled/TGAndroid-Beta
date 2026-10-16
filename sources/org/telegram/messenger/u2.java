package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class u2 implements Runnable {
    public final int f18247a;
    public final FileLoadOperation f18248b;
    public final FileLoadOperation.RequestInfo f18249c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18247a = i10;
        this.f18248b = fileLoadOperation;
        this.f18249c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18247a) {
            case 0:
                this.f18248b.lambda$startDownloadRequest$28(this.f18249c);
                return;
            default:
                this.f18248b.lambda$clearOperation$25(this.f18249c);
                return;
        }
    }
}
