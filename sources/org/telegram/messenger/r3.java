package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f18894a;
    public final FileUploadOperation f18895b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f18894a = i10;
        this.f18895b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18894a) {
            case 0:
                FileUploadOperation.f(this.f18895b);
                return;
            case 1:
                FileUploadOperation.e(this.f18895b);
                return;
            case 2:
                FileUploadOperation.d(this.f18895b);
                return;
            default:
                FileUploadOperation.b(this.f18895b);
                return;
        }
    }
}
