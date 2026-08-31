package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class t2 implements Runnable {
    public final int f20048a;
    public final FileLoadOperation f20049b;
    public final FileLoadOperation.RequestInfo f20050c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f20048a = i10;
        this.f20049b = fileLoadOperation;
        this.f20050c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f20048a) {
            case 0:
                this.f20049b.lambda$startDownloadRequest$27(this.f20050c);
                return;
            default:
                this.f20049b.lambda$clearOperation$24(this.f20050c);
                return;
        }
    }
}
