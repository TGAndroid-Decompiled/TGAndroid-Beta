package org.telegram.messenger;
public final class t3 implements Runnable {
    public final int f19206a;
    public final FileUploadOperation f19207b;
    public final int[] f19208c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19206a = i10;
        this.f19207b = fileUploadOperation;
        this.f19208c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19206a) {
            case 0:
                this.f19207b.lambda$startUploadRequest$5(this.f19208c);
                return;
            default:
                this.f19207b.lambda$startUploadRequest$9(this.f19208c);
                return;
        }
    }
}
