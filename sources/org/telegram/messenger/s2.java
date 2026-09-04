package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f18942a;
    public final FileLoadOperation f18943b;
    public final FileLoadOperation.RequestInfo f18944c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18942a = i10;
        this.f18943b = fileLoadOperation;
        this.f18944c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18942a) {
            case 0:
                this.f18943b.lambda$startDownloadRequest$27(this.f18944c);
                return;
            default:
                this.f18943b.lambda$clearOperation$24(this.f18944c);
                return;
        }
    }
}
