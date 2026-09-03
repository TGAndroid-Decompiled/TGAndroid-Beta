package org.telegram.messenger;
public final class t3 implements Runnable {
    public final int f18438a;
    public final FileUploadOperation f18439b;
    public final int[] f18440c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f18438a = i10;
        this.f18439b = fileUploadOperation;
        this.f18440c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18438a) {
            case 0:
                this.f18439b.lambda$startUploadRequest$5(this.f18440c);
                return;
            default:
                this.f18439b.lambda$startUploadRequest$9(this.f18440c);
                return;
        }
    }
}
