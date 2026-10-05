package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f19042a;
    public final FileUploadOperation f19043b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19042a = i10;
        this.f19043b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19042a) {
            case 0:
                FileUploadOperation.f(this.f19043b);
                return;
            case 1:
                FileUploadOperation.e(this.f19043b);
                return;
            case 2:
                FileUploadOperation.d(this.f19043b);
                return;
            default:
                FileUploadOperation.b(this.f19043b);
                return;
        }
    }
}
