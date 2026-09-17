package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17289a;
    public final FileUploadOperation f17290b;
    public final int[] f17291c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17289a = i10;
        this.f17290b = fileUploadOperation;
        this.f17291c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17289a) {
            case 0:
                this.f17290b.lambda$startUploadRequest$5(this.f17291c);
                return;
            default:
                this.f17290b.lambda$startUploadRequest$9(this.f17291c);
                return;
        }
    }
}
