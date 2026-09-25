package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17502a;
    public final FileLoadOperation f17503b;
    public final FileLoadOperation.RequestInfo f17504c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17502a = i10;
        this.f17503b = fileLoadOperation;
        this.f17504c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17502a) {
            case 0:
                this.f17503b.lambda$startDownloadRequest$27(this.f17504c);
                return;
            default:
                this.f17503b.lambda$clearOperation$24(this.f17504c);
                return;
        }
    }
}
