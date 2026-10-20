package org.telegram.messenger;
public final class x3 implements Runnable {
    public final int f20045a;
    public final FileUploadOperation f20046b;
    public final int[] f20047c;

    public x3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f20045a = i10;
        this.f20046b = fileUploadOperation;
        this.f20047c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20045a) {
            case 0:
                this.f20046b.lambda$startUploadRequest$5(this.f20047c);
                return;
            default:
                this.f20046b.lambda$startUploadRequest$9(this.f20047c);
                return;
        }
    }
}
