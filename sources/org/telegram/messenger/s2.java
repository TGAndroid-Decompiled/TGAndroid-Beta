package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17277a;
    public final FileLoadOperation f17278b;
    public final FileLoadOperation.RequestInfo f17279c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17277a = i10;
        this.f17278b = fileLoadOperation;
        this.f17279c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17277a) {
            case 0:
                this.f17278b.lambda$startDownloadRequest$27(this.f17279c);
                return;
            default:
                this.f17278b.lambda$clearOperation$24(this.f17279c);
                return;
        }
    }
}
