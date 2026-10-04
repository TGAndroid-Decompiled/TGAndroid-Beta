package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f19124a;
    public final FileLoadOperation f19125b;
    public final FileLoadOperation.RequestInfo f19126c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19124a = i10;
        this.f19125b = fileLoadOperation;
        this.f19126c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19124a) {
            case 0:
                this.f19125b.lambda$startDownloadRequest$27(this.f19126c);
                return;
            default:
                this.f19125b.lambda$clearOperation$24(this.f19126c);
                return;
        }
    }
}
