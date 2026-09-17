package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f18944a;
    public final FileLoadOperation f18945b;
    public final FileLoadOperation.RequestInfo f18946c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18944a = i10;
        this.f18945b = fileLoadOperation;
        this.f18946c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18944a) {
            case 0:
                this.f18945b.lambda$startDownloadRequest$27(this.f18946c);
                return;
            default:
                this.f18945b.lambda$clearOperation$24(this.f18946c);
                return;
        }
    }
}
