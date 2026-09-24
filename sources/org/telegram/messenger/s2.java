package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f17487a;
    public final FileLoadOperation f17488b;
    public final FileLoadOperation.RequestInfo f17489c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f17487a = i10;
        this.f17488b = fileLoadOperation;
        this.f17489c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f17487a) {
            case 0:
                this.f17488b.lambda$startDownloadRequest$27(this.f17489c);
                return;
            default:
                this.f17488b.lambda$clearOperation$24(this.f17489c);
                return;
        }
    }
}
