package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f18636a;
    public final FileUploadOperation f18637b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f18636a = i10;
        this.f18637b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18636a) {
            case 0:
                FileUploadOperation.f(this.f18637b);
                return;
            case 1:
                FileUploadOperation.e(this.f18637b);
                return;
            case 2:
                FileUploadOperation.d(this.f18637b);
                return;
            default:
                FileUploadOperation.b(this.f18637b);
                return;
        }
    }
}
