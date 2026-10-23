package org.telegram.messenger;
public final class x3 implements Runnable {
    public final int f20110a;
    public final FileUploadOperation f20111b;

    public x3(FileUploadOperation fileUploadOperation, int i10) {
        this.f20110a = i10;
        this.f20111b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f20110a) {
            case 0:
                FileUploadOperation.f(this.f20111b);
                return;
            case 1:
                FileUploadOperation.e(this.f20111b);
                return;
            case 2:
                FileUploadOperation.d(this.f20111b);
                return;
            default:
                FileUploadOperation.b(this.f20111b);
                return;
        }
    }
}
