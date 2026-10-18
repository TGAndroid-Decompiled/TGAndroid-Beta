package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f19956a;
    public final FileUploadOperation f19957b;
    public final int[] f19958c;

    public w3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19956a = i10;
        this.f19957b = fileUploadOperation;
        this.f19958c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19956a) {
            case 0:
                this.f19957b.lambda$startUploadRequest$5(this.f19958c);
                return;
            default:
                this.f19957b.lambda$startUploadRequest$9(this.f19958c);
                return;
        }
    }
}
