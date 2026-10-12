package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class u2 implements Runnable {
    public final int f18546a;
    public final FileLoadOperation f18547b;
    public final FileLoadOperation.RequestInfo f18548c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18546a = i10;
        this.f18547b = fileLoadOperation;
        this.f18548c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18546a) {
            case 0:
                this.f18547b.lambda$startDownloadRequest$28(this.f18548c);
                return;
            default:
                this.f18547b.lambda$clearOperation$25(this.f18548c);
                return;
        }
    }
}
