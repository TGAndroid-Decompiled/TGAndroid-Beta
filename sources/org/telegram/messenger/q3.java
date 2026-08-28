package org.telegram.messenger;
public final class q3 implements Runnable {
    public final int f21282a;
    public final FileUploadOperation f21283b;

    public q3(FileUploadOperation fileUploadOperation, int i9) {
        this.f21282a = i9;
        this.f21283b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21282a) {
            case 0:
                FileUploadOperation.f(this.f21283b);
                return;
            case 1:
                FileUploadOperation.e(this.f21283b);
                return;
            case 2:
                FileUploadOperation.d(this.f21283b);
                return;
            default:
                FileUploadOperation.b(this.f21283b);
                return;
        }
    }
}
