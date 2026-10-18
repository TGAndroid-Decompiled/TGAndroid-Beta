package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f19696a;
    public final FileUploadOperation f19697b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19696a = i10;
        this.f19697b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19696a) {
            case 0:
                FileUploadOperation.f(this.f19697b);
                return;
            case 1:
                FileUploadOperation.e(this.f19697b);
                return;
            case 2:
                FileUploadOperation.d(this.f19697b);
                return;
            default:
                FileUploadOperation.b(this.f19697b);
                return;
        }
    }
}
