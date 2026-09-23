package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17183a;
    public final FileUploadOperation f17184b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17183a = i10;
        this.f17184b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17183a) {
            case 0:
                FileUploadOperation.f(this.f17184b);
                return;
            case 1:
                FileUploadOperation.e(this.f17184b);
                return;
            case 2:
                FileUploadOperation.d(this.f17184b);
                return;
            default:
                FileUploadOperation.b(this.f17184b);
                return;
        }
    }
}
