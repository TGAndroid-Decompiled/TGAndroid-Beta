package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class v2 implements Runnable {
    public final int f19728a;
    public final FileLoadOperation f19729b;
    public final FileLoadOperation.RequestInfo f19730c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19728a = i10;
        this.f19729b = fileLoadOperation;
        this.f19730c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19728a) {
            case 0:
                this.f19729b.lambda$startDownloadRequest$28(this.f19730c);
                return;
            default:
                this.f19729b.lambda$clearOperation$25(this.f19730c);
                return;
        }
    }
}
