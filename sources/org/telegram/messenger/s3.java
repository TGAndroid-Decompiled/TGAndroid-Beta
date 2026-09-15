package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f17280a;
    public final FileUploadOperation f17281b;
    public final int[] f17282c;

    public s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f17280a = i10;
        this.f17281b = fileUploadOperation;
        this.f17282c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17280a) {
            case 0:
                this.f17281b.lambda$startUploadRequest$5(this.f17282c);
                return;
            default:
                this.f17281b.lambda$startUploadRequest$9(this.f17282c);
                return;
        }
    }
}
