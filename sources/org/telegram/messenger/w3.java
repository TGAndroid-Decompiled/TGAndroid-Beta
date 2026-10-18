package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f19944a;
    public final FileUploadOperation f19945b;
    public final int[] f19946c;

    public w3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19944a = i10;
        this.f19945b = fileUploadOperation;
        this.f19946c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19944a) {
            case 0:
                this.f19945b.lambda$startUploadRequest$5(this.f19946c);
                return;
            default:
                this.f19945b.lambda$startUploadRequest$9(this.f19946c);
                return;
        }
    }
}
