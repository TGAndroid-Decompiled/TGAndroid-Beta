package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19001a;
    public final FileLoadOperation f19002b;
    public final FileLoadOperation.RequestInfo f19003c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19001a = i10;
        this.f19002b = fileLoadOperation;
        this.f19003c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19001a) {
            case 0:
                this.f19002b.lambda$startDownloadRequest$28(this.f19003c);
                return;
            default:
                this.f19002b.lambda$clearOperation$25(this.f19003c);
                return;
        }
    }
}
