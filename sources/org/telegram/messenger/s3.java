package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17490a;
    public final FileUploadOperation f17491b;
    public final int[] f17492c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17490a = i10;
        this.f17491b = fileUploadOperation;
        this.f17492c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17490a) {
            case 0:
                this.f17491b.lambda$startUploadRequest$5(this.f17492c);
                return;
            default:
                this.f17491b.lambda$startUploadRequest$9(this.f17492c);
                return;
        }
    }
}
