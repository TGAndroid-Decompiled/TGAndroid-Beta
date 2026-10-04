package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f19037a;
    public final FileUploadOperation f19038b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19037a = i10;
        this.f19038b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19037a) {
            case 0:
                FileUploadOperation.f(this.f19038b);
                return;
            case 1:
                FileUploadOperation.e(this.f19038b);
                return;
            case 2:
                FileUploadOperation.d(this.f19038b);
                return;
            default:
                FileUploadOperation.b(this.f19038b);
                return;
        }
    }
}
