package org.telegram.messenger;
public final class x3 implements Runnable {
    public final int f16939a;
    public final FileUploadOperation f16940b;
    public final int[] f16941c;

    public x3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f16939a = i10;
        this.f16940b = fileUploadOperation;
        this.f16941c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16939a) {
            case 0:
                this.f16940b.lambda$startUploadRequest$5(this.f16941c);
                return;
            default:
                this.f16940b.lambda$startUploadRequest$9(this.f16941c);
                return;
        }
    }
}
