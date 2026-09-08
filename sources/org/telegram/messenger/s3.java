package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f18972a;
    public final FileUploadOperation f18973b;
    public final int[] f18974c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f18972a = i10;
        this.f18973b = fileUploadOperation;
        this.f18974c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18972a) {
            case 0:
                this.f18973b.lambda$startUploadRequest$5(this.f18974c);
                return;
            default:
                this.f18973b.lambda$startUploadRequest$9(this.f18974c);
                return;
        }
    }
}
