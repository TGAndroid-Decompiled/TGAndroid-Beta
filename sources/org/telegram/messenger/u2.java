package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class u2 implements Runnable {
    public final int f19621a;
    public final FileLoadOperation f19622b;
    public final FileLoadOperation.RequestInfo f19623c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19621a = i10;
        this.f19622b = fileLoadOperation;
        this.f19623c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19621a) {
            case 0:
                this.f19622b.lambda$startDownloadRequest$28(this.f19623c);
                return;
            default:
                this.f19622b.lambda$clearOperation$25(this.f19623c);
                return;
        }
    }
}
