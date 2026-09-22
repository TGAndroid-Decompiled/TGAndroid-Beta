package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17277a;
    public final FileUploadOperation f17278b;
    public final int[] f17279c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17277a = i10;
        this.f17278b = fileUploadOperation;
        this.f17279c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17277a) {
            case 0:
                this.f17278b.lambda$startUploadRequest$5(this.f17279c);
                return;
            default:
                this.f17278b.lambda$startUploadRequest$9(this.f17279c);
                return;
        }
    }
}
