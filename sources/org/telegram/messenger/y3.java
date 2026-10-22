package org.telegram.messenger;
public final class y3 implements Runnable {
    public final int f20117a;
    public final FileUploadOperation f20118b;
    public final int[] f20119c;

    public y3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f20117a = i10;
        this.f20118b = fileUploadOperation;
        this.f20119c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20117a) {
            case 0:
                this.f20118b.lambda$startUploadRequest$5(this.f20119c);
                return;
            default:
                this.f20118b.lambda$startUploadRequest$9(this.f20119c);
                return;
        }
    }
}
