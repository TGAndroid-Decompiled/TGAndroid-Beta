package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17190a;
    public final FileUploadOperation f17191b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17190a = i10;
        this.f17191b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17190a) {
            case 0:
                FileUploadOperation.f(this.f17191b);
                return;
            case 1:
                FileUploadOperation.e(this.f17191b);
                return;
            case 2:
                FileUploadOperation.d(this.f17191b);
                return;
            default:
                FileUploadOperation.b(this.f17191b);
                return;
        }
    }
}
