package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17458a;
    public final FileLoadOperation f17459b;
    public final FileLoadOperation.RequestInfo f17460c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17458a = i10;
        this.f17459b = fileLoadOperation;
        this.f17460c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17458a) {
            case 0:
                this.f17459b.lambda$startDownloadRequest$27(this.f17460c);
                return;
            default:
                this.f17459b.lambda$clearOperation$24(this.f17460c);
                return;
        }
    }
}
