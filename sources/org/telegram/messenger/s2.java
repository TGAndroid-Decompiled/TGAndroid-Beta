package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17507a;
    public final FileLoadOperation f17508b;
    public final FileLoadOperation.RequestInfo f17509c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17507a = i10;
        this.f17508b = fileLoadOperation;
        this.f17509c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17507a) {
            case 0:
                this.f17508b.lambda$startDownloadRequest$27(this.f17509c);
                return;
            default:
                this.f17508b.lambda$clearOperation$24(this.f17509c);
                return;
        }
    }
}
