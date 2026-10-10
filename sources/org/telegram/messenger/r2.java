package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19005a;
    public final FileLoadOperation f19006b;
    public final FileLoadOperation.RequestInfo f19007c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19005a = i10;
        this.f19006b = fileLoadOperation;
        this.f19007c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19005a) {
            case 0:
                this.f19006b.lambda$startDownloadRequest$28(this.f19007c);
                return;
            default:
                this.f19006b.lambda$clearOperation$25(this.f19007c);
                return;
        }
    }
}
