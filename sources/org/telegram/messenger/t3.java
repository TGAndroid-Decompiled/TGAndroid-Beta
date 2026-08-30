package org.telegram.messenger;
public final class t3 implements Runnable {
    public final int f18454a;
    public final FileUploadOperation f18455b;
    public final int[] f18456c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f18454a = i10;
        this.f18455b = fileUploadOperation;
        this.f18456c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18454a) {
            case 0:
                this.f18455b.lambda$startUploadRequest$5(this.f18456c);
                return;
            default:
                this.f18455b.lambda$startUploadRequest$9(this.f18456c);
                return;
        }
    }
}
