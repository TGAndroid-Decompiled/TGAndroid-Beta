package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f19156a;
    public final FileUploadOperation f19157b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19156a = i10;
        this.f19157b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19156a) {
            case 0:
                FileUploadOperation.f(this.f19157b);
                return;
            case 1:
                FileUploadOperation.e(this.f19157b);
                return;
            case 2:
                FileUploadOperation.d(this.f19157b);
                return;
            default:
                FileUploadOperation.b(this.f19157b);
                return;
        }
    }
}
