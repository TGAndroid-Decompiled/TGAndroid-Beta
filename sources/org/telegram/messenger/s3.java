package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19943a;
    public final FileUploadOperation f19944b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19943a = i10;
        this.f19944b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19943a) {
            case 0:
                FileUploadOperation.f(this.f19944b);
                return;
            case 1:
                FileUploadOperation.e(this.f19944b);
                return;
            case 2:
                FileUploadOperation.d(this.f19944b);
                return;
            default:
                FileUploadOperation.b(this.f19944b);
                return;
        }
    }
}
