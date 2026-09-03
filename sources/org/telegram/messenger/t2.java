package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class t2 implements Runnable {
    public final int f18435a;
    public final FileLoadOperation f18436b;
    public final FileLoadOperation.RequestInfo f18437c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18435a = i10;
        this.f18436b = fileLoadOperation;
        this.f18437c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18435a) {
            case 0:
                this.f18436b.lambda$startDownloadRequest$27(this.f18437c);
                return;
            default:
                this.f18436b.lambda$clearOperation$24(this.f18437c);
                return;
        }
    }
}
