package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class t2 implements Runnable {
    public final int f18451a;
    public final FileLoadOperation f18452b;
    public final FileLoadOperation.RequestInfo f18453c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18451a = i10;
        this.f18452b = fileLoadOperation;
        this.f18453c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18451a) {
            case 0:
                this.f18452b.lambda$startDownloadRequest$27(this.f18453c);
                return;
            default:
                this.f18452b.lambda$clearOperation$24(this.f18453c);
                return;
        }
    }
}
