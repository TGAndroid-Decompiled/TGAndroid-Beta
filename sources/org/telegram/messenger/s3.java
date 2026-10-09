package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19103a;
    public final FileUploadOperation f19104b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19103a = i10;
        this.f19104b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19103a) {
            case 0:
                FileUploadOperation.f(this.f19104b);
                return;
            case 1:
                FileUploadOperation.e(this.f19104b);
                return;
            case 2:
                FileUploadOperation.d(this.f19104b);
                return;
            default:
                FileUploadOperation.b(this.f19104b);
                return;
        }
    }
}
