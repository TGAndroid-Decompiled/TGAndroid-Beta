package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f19434a;
    public final FileUploadOperation f19435b;
    public final int[] f19436c;

    public w3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19434a = i10;
        this.f19435b = fileUploadOperation;
        this.f19436c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19434a) {
            case 0:
                this.f19435b.lambda$startUploadRequest$5(this.f19436c);
                return;
            default:
                this.f19435b.lambda$startUploadRequest$9(this.f19436c);
                return;
        }
    }
}
