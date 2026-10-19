package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f19699a;
    public final FileUploadOperation f19700b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19699a = i10;
        this.f19700b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19699a) {
            case 0:
                FileUploadOperation.f(this.f19700b);
                return;
            case 1:
                FileUploadOperation.e(this.f19700b);
                return;
            case 2:
                FileUploadOperation.d(this.f19700b);
                return;
            default:
                FileUploadOperation.b(this.f19700b);
                return;
        }
    }
}
