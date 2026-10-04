package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f19117a;
    public final FileLoadOperation f19118b;
    public final FileLoadOperation.RequestInfo f19119c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19117a = i10;
        this.f19118b = fileLoadOperation;
        this.f19119c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19117a) {
            case 0:
                this.f19118b.lambda$startDownloadRequest$27(this.f19119c);
                return;
            default:
                this.f19118b.lambda$clearOperation$24(this.f19119c);
                return;
        }
    }
}
