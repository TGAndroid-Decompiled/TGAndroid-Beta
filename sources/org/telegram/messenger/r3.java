package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17203a;
    public final FileUploadOperation f17204b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17203a = i10;
        this.f17204b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17203a) {
            case 0:
                FileUploadOperation.f(this.f17204b);
                return;
            case 1:
                FileUploadOperation.e(this.f17204b);
                return;
            case 2:
                FileUploadOperation.d(this.f17204b);
                return;
            default:
                FileUploadOperation.b(this.f17204b);
                return;
        }
    }
}
