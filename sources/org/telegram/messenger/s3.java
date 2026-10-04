package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19127a;
    public final FileUploadOperation f19128b;
    public final int[] f19129c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19127a = i10;
        this.f19128b = fileUploadOperation;
        this.f19129c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19127a) {
            case 0:
                this.f19128b.lambda$startUploadRequest$5(this.f19129c);
                return;
            default:
                this.f19128b.lambda$startUploadRequest$9(this.f19129c);
                return;
        }
    }
}
