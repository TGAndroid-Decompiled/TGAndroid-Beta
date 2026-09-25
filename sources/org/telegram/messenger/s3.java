package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17505a;
    public final FileUploadOperation f17506b;
    public final int[] f17507c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17505a = i10;
        this.f17506b = fileUploadOperation;
        this.f17507c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17505a) {
            case 0:
                this.f17506b.lambda$startUploadRequest$5(this.f17507c);
                return;
            default:
                this.f17506b.lambda$startUploadRequest$9(this.f17507c);
                return;
        }
    }
}
