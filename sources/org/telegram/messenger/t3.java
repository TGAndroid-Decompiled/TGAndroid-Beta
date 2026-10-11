package org.telegram.messenger;
public final class t3 implements Runnable {
    public final int f19248a;
    public final FileUploadOperation f19249b;
    public final int[] f19250c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19248a = i10;
        this.f19249b = fileUploadOperation;
        this.f19250c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19248a) {
            case 0:
                this.f19249b.lambda$startUploadRequest$5(this.f19250c);
                return;
            default:
                this.f19249b.lambda$startUploadRequest$9(this.f19250c);
                return;
        }
    }
}
