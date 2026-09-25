package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17431a;
    public final FileUploadOperation f17432b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17431a = i10;
        this.f17432b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17431a) {
            case 0:
                FileUploadOperation.f(this.f17432b);
                return;
            case 1:
                FileUploadOperation.e(this.f17432b);
                return;
            case 2:
                FileUploadOperation.d(this.f17432b);
                return;
            default:
                FileUploadOperation.b(this.f17432b);
                return;
        }
    }
}
