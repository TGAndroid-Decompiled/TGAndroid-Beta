package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f21493a;
    public final FileLoadOperation f21494b;
    public final FileLoadOperation.RequestInfo f21495c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f21493a = i10;
        this.f21494b = fileLoadOperation;
        this.f21495c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f21493a) {
            case 0:
                this.f21494b.lambda$startDownloadRequest$27(this.f21495c);
                return;
            default:
                this.f21494b.lambda$clearOperation$24(this.f21495c);
                return;
        }
    }
}
