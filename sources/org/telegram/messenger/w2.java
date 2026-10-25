package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class w2 implements Runnable {
    public final int f21725a;
    public final FileLoadOperation f21726b;
    public final FileLoadOperation.RequestInfo f21727c;

    public w2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f21725a = i10;
        this.f21726b = fileLoadOperation;
        this.f21727c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f21725a) {
            case 0:
                this.f21726b.lambda$startDownloadRequest$28(this.f21727c);
                return;
            default:
                this.f21726b.lambda$clearOperation$25(this.f21727c);
                return;
        }
    }
}
