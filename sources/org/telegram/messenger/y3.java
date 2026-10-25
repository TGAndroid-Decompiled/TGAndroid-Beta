package org.telegram.messenger;
public final class y3 implements Runnable {
    public final int f21875a;
    public final FileUploadOperation f21876b;

    public y3(FileUploadOperation fileUploadOperation, int i10) {
        this.f21875a = i10;
        this.f21876b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21875a) {
            case 0:
                this.f21876b.lambda$start$0();
                return;
            case 1:
                this.f21876b.lambda$cancel$3();
                return;
            case 2:
                this.f21876b.lambda$startUploadRequest$7();
                return;
            default:
                this.f21876b.lambda$onNetworkChanged$2();
                return;
        }
    }
}
