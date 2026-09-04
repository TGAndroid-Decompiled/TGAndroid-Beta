package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f18945a;
    public final FileUploadOperation f18946b;
    public final int[] f18947c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f18945a = i10;
        this.f18946b = fileUploadOperation;
        this.f18947c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18945a) {
            case 0:
                this.f18946b.lambda$startUploadRequest$5(this.f18947c);
                return;
            default:
                this.f18946b.lambda$startUploadRequest$9(this.f18947c);
                return;
        }
    }
}
