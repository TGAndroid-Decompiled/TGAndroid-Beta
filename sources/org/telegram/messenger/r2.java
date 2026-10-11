package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class r2 implements Runnable {
    public final int f19008a;
    public final FileLoadOperation f19009b;
    public final FileLoadOperation.RequestInfo f19010c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19008a = i10;
        this.f19009b = fileLoadOperation;
        this.f19010c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19008a) {
            case 0:
                this.f19009b.lambda$startDownloadRequest$28(this.f19010c);
                return;
            default:
                this.f19009b.lambda$clearOperation$25(this.f19010c);
                return;
        }
    }
}
