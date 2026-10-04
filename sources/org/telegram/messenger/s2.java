package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f19118a;
    public final FileLoadOperation f19119b;
    public final FileLoadOperation.RequestInfo f19120c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19118a = i10;
        this.f19119b = fileLoadOperation;
        this.f19120c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19118a) {
            case 0:
                this.f19119b.lambda$startDownloadRequest$27(this.f19120c);
                return;
            default:
                this.f19119b.lambda$clearOperation$24(this.f19120c);
                return;
        }
    }
}
