package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class v2 implements Runnable {
    public final int f19153a;
    public final FileLoadOperation f19154b;
    public final FileLoadOperation.RequestInfo f19155c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19153a = i10;
        this.f19154b = fileLoadOperation;
        this.f19155c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19153a) {
            case 0:
                this.f19154b.lambda$startDownloadRequest$28(this.f19155c);
                return;
            default:
                this.f19154b.lambda$clearOperation$25(this.f19155c);
                return;
        }
    }
}
