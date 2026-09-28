package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17505a;
    public final FileLoadOperation f17506b;
    public final FileLoadOperation.RequestInfo f17507c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17505a = i10;
        this.f17506b = fileLoadOperation;
        this.f17507c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17505a) {
            case 0:
                this.f17506b.lambda$startDownloadRequest$27(this.f17507c);
                return;
            default:
                this.f17506b.lambda$clearOperation$24(this.f17507c);
                return;
        }
    }
}
