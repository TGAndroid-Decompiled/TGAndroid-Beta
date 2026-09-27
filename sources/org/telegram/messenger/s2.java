package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17496a;
    public final FileLoadOperation f17497b;
    public final FileLoadOperation.RequestInfo f17498c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17496a = i10;
        this.f17497b = fileLoadOperation;
        this.f17498c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17496a) {
            case 0:
                this.f17497b.lambda$startDownloadRequest$27(this.f17498c);
                return;
            default:
                this.f17497b.lambda$clearOperation$24(this.f17498c);
                return;
        }
    }
}
