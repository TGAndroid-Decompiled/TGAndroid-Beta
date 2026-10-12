package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f19155a;
    public final FileUploadOperation f19156b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19155a = i10;
        this.f19156b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19155a) {
            case 0:
                FileUploadOperation.f(this.f19156b);
                return;
            case 1:
                FileUploadOperation.e(this.f19156b);
                return;
            case 2:
                FileUploadOperation.d(this.f19156b);
                return;
            default:
                FileUploadOperation.b(this.f19156b);
                return;
        }
    }
}
