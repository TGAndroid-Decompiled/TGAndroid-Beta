package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17508a;
    public final FileUploadOperation f17509b;
    public final int[] f17510c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17508a = i10;
        this.f17509b = fileUploadOperation;
        this.f17510c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17508a) {
            case 0:
                this.f17509b.lambda$startUploadRequest$5(this.f17510c);
                return;
            default:
                this.f17509b.lambda$startUploadRequest$9(this.f17510c);
                return;
        }
    }
}
