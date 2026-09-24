package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17416a;
    public final FileUploadOperation f17417b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17416a = i10;
        this.f17417b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17416a) {
            case 0:
                FileUploadOperation.f(this.f17417b);
                return;
            case 1:
                FileUploadOperation.e(this.f17417b);
                return;
            case 2:
                FileUploadOperation.d(this.f17417b);
                return;
            default:
                FileUploadOperation.b(this.f17417b);
                return;
        }
    }
}
