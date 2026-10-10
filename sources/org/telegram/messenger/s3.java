package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19107a;
    public final FileUploadOperation f19108b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19107a = i10;
        this.f19108b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19107a) {
            case 0:
                FileUploadOperation.f(this.f19108b);
                return;
            case 1:
                FileUploadOperation.e(this.f19108b);
                return;
            case 2:
                FileUploadOperation.d(this.f19108b);
                return;
            default:
                FileUploadOperation.b(this.f19108b);
                return;
        }
    }
}
