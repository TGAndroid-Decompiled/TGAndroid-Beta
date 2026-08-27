package org.telegram.messenger;

public final class t2 implements Runnable {

    public final int f21598a;

    public final FileLoadOperation f21599b;

    public final FileLoadOperation.RequestInfo f21600c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i10) {
        this.f21598a = i10;
        this.f21599b = fileLoadOperation;
        this.f21600c = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.f21598a) {
            case 0:
                this.f21599b.lambda$startDownloadRequest$27(this.f21600c);
                break;
            default:
                this.f21599b.lambda$clearOperation$24(this.f21600c);
                break;
        }
    }
}
