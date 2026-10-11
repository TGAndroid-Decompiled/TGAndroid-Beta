package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19044a;
    public final FileLoadOperation f19045b;
    public final FileLoadOperation.RequestInfo f19046c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19044a = i10;
        this.f19045b = fileLoadOperation;
        this.f19046c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19044a) {
            case 0:
                this.f19045b.lambda$startDownloadRequest$28(this.f19046c);
                return;
            default:
                this.f19045b.lambda$clearOperation$25(this.f19046c);
                return;
        }
    }
}
