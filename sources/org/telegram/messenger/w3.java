package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f16825a;
    public final FileUploadOperation f16826b;

    public w3(FileUploadOperation fileUploadOperation, int i10) {
        this.f16825a = i10;
        this.f16826b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16825a) {
            case 0:
                FileUploadOperation.f(this.f16826b);
                return;
            case 1:
                FileUploadOperation.e(this.f16826b);
                return;
            case 2:
                FileUploadOperation.d(this.f16826b);
                return;
            default:
                FileUploadOperation.b(this.f16826b);
                return;
        }
    }
}
