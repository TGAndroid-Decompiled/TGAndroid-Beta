package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class t2 implements Runnable {
    public final int f20050a;
    public final FileLoadOperation f20051b;
    public final FileLoadOperation.RequestInfo f20052c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f20050a = i10;
        this.f20051b = fileLoadOperation;
        this.f20052c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f20050a) {
            case 0:
                this.f20051b.lambda$startDownloadRequest$27(this.f20052c);
                return;
            default:
                this.f20051b.lambda$clearOperation$24(this.f20052c);
                return;
        }
    }
}
