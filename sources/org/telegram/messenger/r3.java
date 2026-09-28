package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17429a;
    public final FileUploadOperation f17430b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17429a = i10;
        this.f17430b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17429a) {
            case 0:
                FileUploadOperation.f(this.f17430b);
                return;
            case 1:
                FileUploadOperation.e(this.f17430b);
                return;
            case 2:
                FileUploadOperation.d(this.f17430b);
                return;
            default:
                FileUploadOperation.b(this.f17430b);
                return;
        }
    }
}
