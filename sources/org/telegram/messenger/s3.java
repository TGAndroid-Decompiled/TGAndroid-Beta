package org.telegram.messenger;

public final class s3 implements Runnable {

    public final int f21488a;

    public final FileUploadOperation f21489b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f21488a = i10;
        this.f21489b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21488a) {
            case 0:
                this.f21489b.lambda$start$0();
                break;
            case 1:
                this.f21489b.lambda$cancel$3();
                break;
            case 2:
                this.f21489b.lambda$startUploadRequest$7();
                break;
            default:
                this.f21489b.lambda$onNetworkChanged$2();
                break;
        }
    }
}
