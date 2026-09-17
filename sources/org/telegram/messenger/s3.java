package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f18974a;
    public final FileUploadOperation f18975b;
    public final int[] f18976c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f18974a = i10;
        this.f18975b = fileUploadOperation;
        this.f18976c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18974a) {
            case 0:
                this.f18975b.lambda$startUploadRequest$5(this.f18976c);
                return;
            default:
                this.f18975b.lambda$startUploadRequest$9(this.f18976c);
                return;
        }
    }
}
