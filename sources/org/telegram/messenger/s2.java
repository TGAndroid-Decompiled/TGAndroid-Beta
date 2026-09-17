package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f18971a;
    public final FileLoadOperation f18972b;
    public final FileLoadOperation.RequestInfo f18973c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f18971a = i10;
        this.f18972b = fileLoadOperation;
        this.f18973c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f18971a) {
            case 0:
                this.f18972b.lambda$startDownloadRequest$27(this.f18973c);
                return;
            default:
                this.f18972b.lambda$clearOperation$24(this.f18973c);
                return;
        }
    }
}
