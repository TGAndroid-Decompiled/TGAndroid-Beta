package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class v2 implements Runnable {
    public final int f19708a;
    public final FileLoadOperation f19709b;
    public final FileLoadOperation.RequestInfo f19710c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19708a = i10;
        this.f19709b = fileLoadOperation;
        this.f19710c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19708a) {
            case 0:
                this.f19709b.lambda$startDownloadRequest$28(this.f19710c);
                return;
            default:
                this.f19709b.lambda$clearOperation$25(this.f19710c);
                return;
        }
    }
}
