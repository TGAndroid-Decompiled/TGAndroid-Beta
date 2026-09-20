package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17495a;
    public final FileUploadOperation f17496b;
    public final int[] f17497c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17495a = i10;
        this.f17496b = fileUploadOperation;
        this.f17497c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17495a) {
            case 0:
                this.f17496b.lambda$startUploadRequest$5(this.f17497c);
                return;
            default:
                this.f17496b.lambda$startUploadRequest$9(this.f17497c);
                return;
        }
    }
}
