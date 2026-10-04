package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19120a;
    public final FileUploadOperation f19121b;
    public final int[] f19122c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19120a = i10;
        this.f19121b = fileUploadOperation;
        this.f19122c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19120a) {
            case 0:
                this.f19121b.lambda$startUploadRequest$5(this.f19122c);
                return;
            default:
                this.f19121b.lambda$startUploadRequest$9(this.f19122c);
                return;
        }
    }
}
