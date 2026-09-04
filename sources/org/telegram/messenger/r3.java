package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f18848a;
    public final FileUploadOperation f18849b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f18848a = i10;
        this.f18849b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18848a) {
            case 0:
                FileUploadOperation.f(this.f18849b);
                return;
            case 1:
                FileUploadOperation.e(this.f18849b);
                return;
            case 2:
                FileUploadOperation.d(this.f18849b);
                return;
            default:
                FileUploadOperation.b(this.f18849b);
                return;
        }
    }
}
