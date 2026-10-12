package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f18894a;
    public final FileUploadOperation f18895b;
    public final int[] f18896c;

    public w3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f18894a = i10;
        this.f18895b = fileUploadOperation;
        this.f18896c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18894a) {
            case 0:
                this.f18895b.lambda$startUploadRequest$5(this.f18896c);
                return;
            default:
                this.f18895b.lambda$startUploadRequest$9(this.f18896c);
                return;
        }
    }
}
