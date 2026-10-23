package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class v2 implements Runnable {
    public final int f19791a;
    public final FileLoadOperation f19792b;
    public final FileLoadOperation.RequestInfo f19793c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19791a = i10;
        this.f19792b = fileLoadOperation;
        this.f19793c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19791a) {
            case 0:
                this.f19792b.lambda$startDownloadRequest$28(this.f19793c);
                return;
            default:
                this.f19792b.lambda$clearOperation$25(this.f19793c);
                return;
        }
    }
}
