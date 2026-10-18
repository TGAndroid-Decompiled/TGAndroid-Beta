package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class u2 implements Runnable {
    public final int f19618a;
    public final FileLoadOperation f19619b;
    public final FileLoadOperation.RequestInfo f19620c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19618a = i10;
        this.f19619b = fileLoadOperation;
        this.f19620c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19618a) {
            case 0:
                this.f19619b.lambda$startDownloadRequest$28(this.f19620c);
                return;
            default:
                this.f19619b.lambda$clearOperation$25(this.f19620c);
                return;
        }
    }
}
