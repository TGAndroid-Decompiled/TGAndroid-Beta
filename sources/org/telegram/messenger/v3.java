package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f19711a;
    public final FileUploadOperation f19712b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19711a = i10;
        this.f19712b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19711a) {
            case 0:
                FileUploadOperation.f(this.f19712b);
                return;
            case 1:
                FileUploadOperation.e(this.f19712b);
                return;
            case 2:
                FileUploadOperation.d(this.f19712b);
                return;
            default:
                FileUploadOperation.b(this.f19712b);
                return;
        }
    }
}
