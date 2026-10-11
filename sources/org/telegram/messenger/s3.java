package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19109a;
    public final FileUploadOperation f19110b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19109a = i10;
        this.f19110b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19109a) {
            case 0:
                FileUploadOperation.f(this.f19110b);
                return;
            case 1:
                FileUploadOperation.e(this.f19110b);
                return;
            case 2:
                FileUploadOperation.d(this.f19110b);
                return;
            default:
                FileUploadOperation.b(this.f19110b);
                return;
        }
    }
}
