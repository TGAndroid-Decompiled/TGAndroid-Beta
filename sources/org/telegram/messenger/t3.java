package org.telegram.messenger;
public final class t3 implements Runnable {
    public final int f19210a;
    public final FileUploadOperation f19211b;
    public final int[] f19212c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19210a = i10;
        this.f19211b = fileUploadOperation;
        this.f19212c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19210a) {
            case 0:
                this.f19211b.lambda$startUploadRequest$5(this.f19212c);
                return;
            default:
                this.f19211b.lambda$startUploadRequest$9(this.f19212c);
                return;
        }
    }
}
