package org.telegram.messenger;
public final class t3 implements Runnable {
    public final int f20051a;
    public final FileUploadOperation f20052b;
    public final int[] f20053c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f20051a = i10;
        this.f20052b = fileUploadOperation;
        this.f20053c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20051a) {
            case 0:
                this.f20052b.lambda$startUploadRequest$5(this.f20053c);
                return;
            default:
                this.f20052b.lambda$startUploadRequest$9(this.f20053c);
                return;
        }
    }
}
