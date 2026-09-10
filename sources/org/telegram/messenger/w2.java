package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class w2 implements Runnable {
    public final int f16822a;
    public final FileLoadOperation f16823b;
    public final FileLoadOperation.RequestInfo f16824c;

    public w2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f16822a = i10;
        this.f16823b = fileLoadOperation;
        this.f16824c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f16822a) {
            case 0:
                this.f16823b.lambda$startDownloadRequest$27(this.f16824c);
                return;
            default:
                this.f16823b.lambda$clearOperation$24(this.f16824c);
                return;
        }
    }
}
