package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f19145a;
    public final FileUploadOperation f19146b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19145a = i10;
        this.f19146b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19145a) {
            case 0:
                FileUploadOperation.f(this.f19146b);
                return;
            case 1:
                FileUploadOperation.e(this.f19146b);
                return;
            case 2:
                FileUploadOperation.d(this.f19146b);
                return;
            default:
                FileUploadOperation.b(this.f19146b);
                return;
        }
    }
}
