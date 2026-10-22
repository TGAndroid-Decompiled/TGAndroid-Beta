package org.telegram.messenger;
public final class x3 implements Runnable {
    public final int f20042a;
    public final FileUploadOperation f20043b;

    public x3(FileUploadOperation fileUploadOperation, int i10) {
        this.f20042a = i10;
        this.f20043b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f20042a) {
            case 0:
                FileUploadOperation.f(this.f20043b);
                return;
            case 1:
                FileUploadOperation.e(this.f20043b);
                return;
            case 2:
                FileUploadOperation.d(this.f20043b);
                return;
            default:
                FileUploadOperation.b(this.f20043b);
                return;
        }
    }
}
