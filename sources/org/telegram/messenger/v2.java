package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class v2 implements Runnable {
    public final int f19727a;
    public final FileLoadOperation f19728b;
    public final FileLoadOperation.RequestInfo f19729c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19727a = i10;
        this.f19728b = fileLoadOperation;
        this.f19729c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19727a) {
            case 0:
                this.f19728b.lambda$startDownloadRequest$28(this.f19729c);
                return;
            default:
                this.f19728b.lambda$clearOperation$25(this.f19729c);
                return;
        }
    }
}
