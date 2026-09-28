package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17509a;
    public final FileUploadOperation f17510b;
    public final int[] f17511c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17509a = i10;
        this.f17510b = fileUploadOperation;
        this.f17511c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17509a) {
            case 0:
                this.f17510b.lambda$startUploadRequest$5(this.f17511c);
                return;
            default:
                this.f17510b.lambda$startUploadRequest$9(this.f17511c);
                return;
        }
    }
}
