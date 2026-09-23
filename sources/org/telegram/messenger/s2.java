package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17255a;
    public final FileLoadOperation f17256b;
    public final FileLoadOperation.RequestInfo f17257c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17255a = i10;
        this.f17256b = fileLoadOperation;
        this.f17257c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17255a) {
            case 0:
                this.f17256b.lambda$startDownloadRequest$27(this.f17257c);
                return;
            default:
                this.f17256b.lambda$clearOperation$24(this.f17257c);
                return;
        }
    }
}
