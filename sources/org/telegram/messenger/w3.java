package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f19950a;
    public final FileUploadOperation f19951b;
    public final int[] f19952c;

    public w3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19950a = i10;
        this.f19951b = fileUploadOperation;
        this.f19952c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19950a) {
            case 0:
                this.f19951b.lambda$startUploadRequest$5(this.f19952c);
                return;
            default:
                this.f19951b.lambda$startUploadRequest$9(this.f19952c);
                return;
        }
    }
}
