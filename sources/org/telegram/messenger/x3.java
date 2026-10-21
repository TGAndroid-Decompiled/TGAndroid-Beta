package org.telegram.messenger;
public final class x3 implements Runnable {
    public final int f20043a;
    public final FileUploadOperation f20044b;

    public x3(FileUploadOperation fileUploadOperation, int i10) {
        this.f20043a = i10;
        this.f20044b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f20043a) {
            case 0:
                FileUploadOperation.f(this.f20044b);
                return;
            case 1:
                FileUploadOperation.e(this.f20044b);
                return;
            case 2:
                FileUploadOperation.d(this.f20044b);
                return;
            default:
                FileUploadOperation.b(this.f20044b);
                return;
        }
    }
}
