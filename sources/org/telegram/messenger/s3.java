package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19941a;
    public final FileUploadOperation f19942b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19941a = i10;
        this.f19942b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19941a) {
            case 0:
                FileUploadOperation.f(this.f19942b);
                return;
            case 1:
                FileUploadOperation.e(this.f19942b);
                return;
            case 2:
                FileUploadOperation.d(this.f19942b);
                return;
            default:
                FileUploadOperation.b(this.f19942b);
                return;
        }
    }
}
