package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17446a;
    public final FileUploadOperation f17447b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17446a = i10;
        this.f17447b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17446a) {
            case 0:
                FileUploadOperation.f(this.f17447b);
                return;
            case 1:
                FileUploadOperation.e(this.f17447b);
                return;
            case 2:
                FileUploadOperation.d(this.f17447b);
                return;
            default:
                FileUploadOperation.b(this.f17447b);
                return;
        }
    }
}
