package org.telegram.messenger;
public final class x3 implements Runnable {
    public final int f20045a;
    public final FileUploadOperation f20046b;

    public x3(FileUploadOperation fileUploadOperation, int i10) {
        this.f20045a = i10;
        this.f20046b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f20045a) {
            case 0:
                FileUploadOperation.f(this.f20046b);
                return;
            case 1:
                FileUploadOperation.e(this.f20046b);
                return;
            case 2:
                FileUploadOperation.d(this.f20046b);
                return;
            default:
                FileUploadOperation.b(this.f20046b);
                return;
        }
    }
}
