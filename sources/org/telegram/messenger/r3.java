package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f21369a;
    public final FileUploadOperation f21370b;
    public final int[] f21371c;

    public r3(FileUploadOperation fileUploadOperation, int[] iArr, int i9) {
        this.f21369a = i9;
        this.f21370b = fileUploadOperation;
        this.f21371c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f21369a) {
            case 0:
                this.f21370b.lambda$startUploadRequest$5(this.f21371c);
                return;
            default:
                this.f21370b.lambda$startUploadRequest$9(this.f21371c);
                return;
        }
    }
}
