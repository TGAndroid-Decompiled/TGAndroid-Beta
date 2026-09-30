package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17506a;
    public final FileLoadOperation f17507b;
    public final FileLoadOperation.RequestInfo f17508c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17506a = i10;
        this.f17507b = fileLoadOperation;
        this.f17508c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17506a) {
            case 0:
                this.f17507b.lambda$startDownloadRequest$27(this.f17508c);
                return;
            default:
                this.f17507b.lambda$clearOperation$24(this.f17508c);
                return;
        }
    }
}
