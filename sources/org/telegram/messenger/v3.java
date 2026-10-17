package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f19710a;
    public final FileUploadOperation f19711b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19710a = i10;
        this.f19711b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19710a) {
            case 0:
                FileUploadOperation.f(this.f19711b);
                return;
            case 1:
                FileUploadOperation.e(this.f19711b);
                return;
            case 2:
                FileUploadOperation.d(this.f19711b);
                return;
            default:
                FileUploadOperation.b(this.f19711b);
                return;
        }
    }
}
