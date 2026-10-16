package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f18594a;
    public final FileUploadOperation f18595b;
    public final int[] f18596c;

    public w3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f18594a = i10;
        this.f18595b = fileUploadOperation;
        this.f18596c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18594a) {
            case 0:
                this.f18595b.lambda$startUploadRequest$5(this.f18596c);
                return;
            default:
                this.f18595b.lambda$startUploadRequest$9(this.f18596c);
                return;
        }
    }
}
