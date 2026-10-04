package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f19032a;
    public final FileUploadOperation f19033b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19032a = i10;
        this.f19033b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19032a) {
            case 0:
                FileUploadOperation.f(this.f19033b);
                return;
            case 1:
                FileUploadOperation.e(this.f19033b);
                return;
            case 2:
                FileUploadOperation.d(this.f19033b);
                return;
            default:
                FileUploadOperation.b(this.f19033b);
                return;
        }
    }
}
