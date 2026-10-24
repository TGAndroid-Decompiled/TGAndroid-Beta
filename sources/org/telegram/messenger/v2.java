package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class v2 implements Runnable {
    public final int f19790a;
    public final FileLoadOperation f19791b;
    public final FileLoadOperation.RequestInfo f19792c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19790a = i10;
        this.f19791b = fileLoadOperation;
        this.f19792c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19790a) {
            case 0:
                this.f19791b.lambda$startDownloadRequest$28(this.f19792c);
                return;
            default:
                this.f19791b.lambda$clearOperation$25(this.f19792c);
                return;
        }
    }
}
