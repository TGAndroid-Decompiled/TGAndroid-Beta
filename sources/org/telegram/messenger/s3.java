package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19121a;
    public final FileUploadOperation f19122b;
    public final int[] f19123c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19121a = i10;
        this.f19122b = fileUploadOperation;
        this.f19123c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19121a) {
            case 0:
                this.f19122b.lambda$startUploadRequest$5(this.f19123c);
                return;
            default:
                this.f19122b.lambda$startUploadRequest$9(this.f19123c);
                return;
        }
    }
}
