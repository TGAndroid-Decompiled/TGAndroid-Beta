package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class s2 implements Runnable {
    public final int f19129a;
    public final FileLoadOperation f19130b;
    public final FileLoadOperation.RequestInfo f19131c;

    public s2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19129a = i10;
        this.f19130b = fileLoadOperation;
        this.f19131c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19129a) {
            case 0:
                this.f19130b.lambda$startDownloadRequest$27(this.f19131c);
                return;
            default:
                this.f19130b.lambda$clearOperation$24(this.f19131c);
                return;
        }
    }
}
