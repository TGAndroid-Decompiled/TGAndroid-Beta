package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f18947a;
    public final FileUploadOperation f18948b;
    public final int[] f18949c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f18947a = i10;
        this.f18948b = fileUploadOperation;
        this.f18949c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18947a) {
            case 0:
                this.f18948b.lambda$startUploadRequest$5(this.f18949c);
                return;
            default:
                this.f18948b.lambda$startUploadRequest$9(this.f18949c);
                return;
        }
    }
}
