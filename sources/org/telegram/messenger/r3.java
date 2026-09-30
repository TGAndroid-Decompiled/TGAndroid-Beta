package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17430a;
    public final FileUploadOperation f17431b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17430a = i10;
        this.f17431b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17430a) {
            case 0:
                FileUploadOperation.f(this.f17431b);
                return;
            case 1:
                FileUploadOperation.e(this.f17431b);
                return;
            case 2:
                FileUploadOperation.d(this.f17431b);
                return;
            default:
                FileUploadOperation.b(this.f17431b);
                return;
        }
    }
}
