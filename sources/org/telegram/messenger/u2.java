package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class u2 implements Runnable {
    public final int f19617a;
    public final FileLoadOperation f19618b;
    public final FileLoadOperation.RequestInfo f19619c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19617a = i10;
        this.f19618b = fileLoadOperation;
        this.f19619c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19617a) {
            case 0:
                this.f19618b.lambda$startDownloadRequest$28(this.f19619c);
                return;
            default:
                this.f19618b.lambda$clearOperation$25(this.f19619c);
                return;
        }
    }
}
