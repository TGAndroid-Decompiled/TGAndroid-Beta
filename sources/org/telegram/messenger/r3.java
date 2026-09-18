package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17375a;
    public final FileUploadOperation f17376b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17375a = i10;
        this.f17376b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17375a) {
            case 0:
                FileUploadOperation.f(this.f17376b);
                return;
            case 1:
                FileUploadOperation.e(this.f17376b);
                return;
            case 2:
                FileUploadOperation.d(this.f17376b);
                return;
            default:
                FileUploadOperation.b(this.f17376b);
                return;
        }
    }
}
