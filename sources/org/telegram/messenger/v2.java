package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class v2 implements Runnable {
    public final int f19705a;
    public final FileLoadOperation f19706b;
    public final FileLoadOperation.RequestInfo f19707c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19705a = i10;
        this.f19706b = fileLoadOperation;
        this.f19707c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19705a) {
            case 0:
                this.f19706b.lambda$startDownloadRequest$28(this.f19707c);
                return;
            default:
                this.f19706b.lambda$clearOperation$25(this.f19707c);
                return;
        }
    }
}
