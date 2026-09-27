package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17499a;
    public final FileUploadOperation f17500b;
    public final int[] f17501c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17499a = i10;
        this.f17500b = fileUploadOperation;
        this.f17501c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17499a) {
            case 0:
                this.f17500b.lambda$startUploadRequest$5(this.f17501c);
                return;
            default:
                this.f17500b.lambda$startUploadRequest$9(this.f17501c);
                return;
        }
    }
}
