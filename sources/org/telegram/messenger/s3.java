package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17510a;
    public final FileUploadOperation f17511b;
    public final int[] f17512c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17510a = i10;
        this.f17511b = fileUploadOperation;
        this.f17512c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17510a) {
            case 0:
                this.f17511b.lambda$startUploadRequest$5(this.f17512c);
                return;
            default:
                this.f17511b.lambda$startUploadRequest$9(this.f17512c);
                return;
        }
    }
}
