package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17492a;
    public final FileLoadOperation f17493b;
    public final FileLoadOperation.RequestInfo f17494c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17492a = i10;
        this.f17493b = fileLoadOperation;
        this.f17494c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17492a) {
            case 0:
                this.f17493b.lambda$startDownloadRequest$27(this.f17494c);
                return;
            default:
                this.f17493b.lambda$clearOperation$24(this.f17494c);
                return;
        }
    }
}
