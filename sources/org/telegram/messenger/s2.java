package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17522a;
    public final FileLoadOperation f17523b;
    public final FileLoadOperation.RequestInfo f17524c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17522a = i10;
        this.f17523b = fileLoadOperation;
        this.f17524c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17522a) {
            case 0:
                this.f17523b.lambda$startDownloadRequest$27(this.f17524c);
                return;
            default:
                this.f17523b.lambda$clearOperation$24(this.f17524c);
                return;
        }
    }
}
