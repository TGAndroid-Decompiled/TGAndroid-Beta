package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f18969a;
    public final FileLoadOperation f18970b;
    public final FileLoadOperation.RequestInfo f18971c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18969a = i10;
        this.f18970b = fileLoadOperation;
        this.f18971c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18969a) {
            case 0:
                this.f18970b.lambda$startDownloadRequest$27(this.f18971c);
                return;
            default:
                this.f18970b.lambda$clearOperation$24(this.f18971c);
                return;
        }
    }
}
