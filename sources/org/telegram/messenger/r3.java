package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f18875a;
    public final FileUploadOperation f18876b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f18875a = i10;
        this.f18876b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18875a) {
            case 0:
                FileUploadOperation.f(this.f18876b);
                return;
            case 1:
                FileUploadOperation.e(this.f18876b);
                return;
            case 2:
                FileUploadOperation.d(this.f18876b);
                return;
            default:
                FileUploadOperation.b(this.f18876b);
                return;
        }
    }
}
