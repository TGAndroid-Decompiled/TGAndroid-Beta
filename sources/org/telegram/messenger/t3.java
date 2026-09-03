package org.telegram.messenger;
public final class t3 implements Runnable {
    public final int f20053a;
    public final FileUploadOperation f20054b;
    public final int[] f20055c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f20053a = i10;
        this.f20054b = fileUploadOperation;
        this.f20055c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20053a) {
            case 0:
                this.f20054b.lambda$startUploadRequest$5(this.f20055c);
                return;
            default:
                this.f20054b.lambda$startUploadRequest$9(this.f20055c);
                return;
        }
    }
}
