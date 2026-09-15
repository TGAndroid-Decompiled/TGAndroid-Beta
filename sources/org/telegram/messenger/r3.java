package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f17194a;
    public final FileUploadOperation f17195b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f17194a = i10;
        this.f17195b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17194a) {
            case 0:
                FileUploadOperation.f(this.f17195b);
                return;
            case 1:
                FileUploadOperation.e(this.f17195b);
                return;
            case 2:
                FileUploadOperation.d(this.f17195b);
                return;
            default:
                FileUploadOperation.b(this.f17195b);
                return;
        }
    }
}
