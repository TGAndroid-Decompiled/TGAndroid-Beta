package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17425a;
    public final FileUploadOperation f17426b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17425a = i10;
        this.f17426b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17425a) {
            case 0:
                FileUploadOperation.f(this.f17426b);
                return;
            case 1:
                FileUploadOperation.e(this.f17426b);
                return;
            case 2:
                FileUploadOperation.d(this.f17426b);
                return;
            default:
                FileUploadOperation.b(this.f17426b);
                return;
        }
    }
}
