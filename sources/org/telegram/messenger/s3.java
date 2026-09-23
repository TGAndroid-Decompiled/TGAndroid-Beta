package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17258a;
    public final FileUploadOperation f17259b;
    public final int[] f17260c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17258a = i10;
        this.f17259b = fileUploadOperation;
        this.f17260c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17258a) {
            case 0:
                this.f17259b.lambda$startUploadRequest$5(this.f17260c);
                return;
            default:
                this.f17259b.lambda$startUploadRequest$9(this.f17260c);
                return;
        }
    }
}
