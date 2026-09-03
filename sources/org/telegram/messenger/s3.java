package org.telegram.messenger;
public final class s3 implements Runnable {
    public final int f18338a;
    public final FileUploadOperation f18339b;

    public s3(FileUploadOperation fileUploadOperation, int i10) {
        this.f18338a = i10;
        this.f18339b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18338a) {
            case 0:
                FileUploadOperation.f(this.f18339b);
                return;
            case 1:
                FileUploadOperation.e(this.f18339b);
                return;
            case 2:
                FileUploadOperation.d(this.f18339b);
                return;
            default:
                FileUploadOperation.b(this.f18339b);
                return;
        }
    }
}
