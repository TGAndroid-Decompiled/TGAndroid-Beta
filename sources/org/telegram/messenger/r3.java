package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f21401a;
    public final FileUploadOperation f21402b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f21401a = i10;
        this.f21402b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21401a) {
            case 0:
                FileUploadOperation.f(this.f21402b);
                return;
            case 1:
                FileUploadOperation.e(this.f21402b);
                return;
            case 2:
                FileUploadOperation.d(this.f21402b);
                return;
            default:
                FileUploadOperation.b(this.f21402b);
                return;
        }
    }
}
