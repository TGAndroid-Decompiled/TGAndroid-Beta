package org.telegram.messenger;
public final class x3 implements Runnable {
    public final int f20107a;
    public final FileUploadOperation f20108b;

    public x3(FileUploadOperation fileUploadOperation, int i10) {
        this.f20107a = i10;
        this.f20108b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f20107a) {
            case 0:
                FileUploadOperation.f(this.f20108b);
                return;
            case 1:
                FileUploadOperation.e(this.f20108b);
                return;
            case 2:
                FileUploadOperation.d(this.f20108b);
                return;
            default:
                FileUploadOperation.b(this.f20108b);
                return;
        }
    }
}
