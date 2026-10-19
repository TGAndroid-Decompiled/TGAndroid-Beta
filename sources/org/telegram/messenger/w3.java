package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f19947a;
    public final FileUploadOperation f19948b;
    public final int[] f19949c;

    public w3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19947a = i10;
        this.f19948b = fileUploadOperation;
        this.f19949c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19947a) {
            case 0:
                this.f19948b.lambda$startUploadRequest$5(this.f19949c);
                return;
            default:
                this.f19948b.lambda$startUploadRequest$9(this.f19949c);
                return;
        }
    }
}
