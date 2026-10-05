package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19132a;
    public final FileUploadOperation f19133b;
    public final int[] f19134c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19132a = i10;
        this.f19133b = fileUploadOperation;
        this.f19134c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19132a) {
            case 0:
                this.f19133b.lambda$startUploadRequest$5(this.f19134c);
                return;
            default:
                this.f19133b.lambda$startUploadRequest$9(this.f19134c);
                return;
        }
    }
}
