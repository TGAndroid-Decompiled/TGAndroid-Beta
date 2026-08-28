package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f21439a;
    public final FileLoadOperation f21440b;
    public final FileLoadOperation.RequestInfo f21441c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i9) {
        this.f21439a = i9;
        this.f21440b = fileLoadOperation;
        this.f21441c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f21439a) {
            case 0:
                this.f21440b.lambda$startDownloadRequest$27(this.f21441c);
                return;
            default:
                this.f21440b.lambda$clearOperation$24(this.f21441c);
                return;
        }
    }
}
