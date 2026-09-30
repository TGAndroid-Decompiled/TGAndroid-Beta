package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17525a;
    public final FileUploadOperation f17526b;
    public final int[] f17527c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17525a = i10;
        this.f17526b = fileUploadOperation;
        this.f17527c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17525a) {
            case 0:
                this.f17526b.lambda$startUploadRequest$5(this.f17527c);
                return;
            default:
                this.f17526b.lambda$startUploadRequest$9(this.f17527c);
                return;
        }
    }
}
