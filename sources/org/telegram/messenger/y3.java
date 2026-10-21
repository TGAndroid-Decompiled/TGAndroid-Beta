package org.telegram.messenger;
public final class y3 implements Runnable {
    public final int f20121a;
    public final FileUploadOperation f20122b;
    public final int[] f20123c;

    public y3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f20121a = i10;
        this.f20122b = fileUploadOperation;
        this.f20123c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20121a) {
            case 0:
                this.f20122b.lambda$startUploadRequest$5(this.f20123c);
                return;
            default:
                this.f20122b.lambda$startUploadRequest$9(this.f20123c);
                return;
        }
    }
}
