package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f18358a;
    public final FileUploadOperation f18359b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f18358a = i10;
        this.f18359b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18358a) {
            case 0:
                FileUploadOperation.f(this.f18359b);
                return;
            case 1:
                FileUploadOperation.e(this.f18359b);
                return;
            case 2:
                FileUploadOperation.d(this.f18359b);
                return;
            default:
                FileUploadOperation.b(this.f18359b);
                return;
        }
    }
}
