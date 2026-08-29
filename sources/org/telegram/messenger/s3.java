package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f21496a;
    public final FileUploadOperation f21497b;
    public final int[] f21498c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f21496a = i10;
        this.f21497b = fileUploadOperation;
        this.f21498c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f21496a) {
            case 0:
                this.f21497b.lambda$startUploadRequest$5(this.f21498c);
                return;
            default:
                this.f21497b.lambda$startUploadRequest$9(this.f21498c);
                return;
        }
    }
}
