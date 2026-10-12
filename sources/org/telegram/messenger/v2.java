package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
public final class v2 implements Runnable {
    public final int f19152a;
    public final FileLoadOperation f19153b;
    public final FileLoadOperation.RequestInfo f19154c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f19152a = i10;
        this.f19153b = fileLoadOperation;
        this.f19154c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f19152a) {
            case 0:
                this.f19153b.lambda$startDownloadRequest$28(this.f19154c);
                return;
            default:
                this.f19153b.lambda$clearOperation$25(this.f19154c);
                return;
        }
    }
}
