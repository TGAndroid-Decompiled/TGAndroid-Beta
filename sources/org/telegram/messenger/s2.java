package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17286a;
    public final FileLoadOperation f17287b;
    public final FileLoadOperation.RequestInfo f17288c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17286a = i10;
        this.f17287b = fileLoadOperation;
        this.f17288c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17286a) {
            case 0:
                this.f17287b.lambda$startDownloadRequest$27(this.f17288c);
                return;
            default:
                this.f17287b.lambda$clearOperation$24(this.f17288c);
                return;
        }
    }
}
