package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17461a;
    public final FileUploadOperation f17462b;
    public final int[] f17463c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17461a = i10;
        this.f17462b = fileUploadOperation;
        this.f17463c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17461a) {
            case 0:
                this.f17462b.lambda$startUploadRequest$5(this.f17463c);
                return;
            default:
                this.f17462b.lambda$startUploadRequest$9(this.f17463c);
                return;
        }
    }
}
