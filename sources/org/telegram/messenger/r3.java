package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f19033a;
    public final FileUploadOperation f19034b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19033a = i10;
        this.f19034b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19033a) {
            case 0:
                FileUploadOperation.f(this.f19034b);
                return;
            case 1:
                FileUploadOperation.e(this.f19034b);
                return;
            case 2:
                FileUploadOperation.d(this.f19034b);
                return;
            default:
                FileUploadOperation.b(this.f19034b);
                return;
        }
    }
}
