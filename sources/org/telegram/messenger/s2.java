package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17274a;
    public final FileLoadOperation f17275b;
    public final FileLoadOperation.RequestInfo f17276c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17274a = i10;
        this.f17275b = fileLoadOperation;
        this.f17276c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17274a) {
            case 0:
                this.f17275b.lambda$startDownloadRequest$27(this.f17276c);
                return;
            default:
                this.f17275b.lambda$clearOperation$24(this.f17276c);
                return;
        }
    }
}
