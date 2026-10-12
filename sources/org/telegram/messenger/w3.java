package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f19433a;
    public final FileUploadOperation f19434b;
    public final int[] f19435c;

    public w3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19433a = i10;
        this.f19434b = fileUploadOperation;
        this.f19435c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19433a) {
            case 0:
                this.f19434b.lambda$startUploadRequest$5(this.f19435c);
                return;
            default:
                this.f19434b.lambda$startUploadRequest$9(this.f19435c);
                return;
        }
    }
}
