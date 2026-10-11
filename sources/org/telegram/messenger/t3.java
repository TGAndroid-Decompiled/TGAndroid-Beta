package org.telegram.messenger;
public final class t3 implements Runnable {
    public final int f19212a;
    public final FileUploadOperation f19213b;
    public final int[] f19214c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19212a = i10;
        this.f19213b = fileUploadOperation;
        this.f19214c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19212a) {
            case 0:
                this.f19213b.lambda$startUploadRequest$5(this.f19214c);
                return;
            default:
                this.f19213b.lambda$startUploadRequest$9(this.f19214c);
                return;
        }
    }
}
