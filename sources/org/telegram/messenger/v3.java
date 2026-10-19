package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f19708a;
    public final FileUploadOperation f19709b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f19708a = i10;
        this.f19709b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19708a) {
            case 0:
                FileUploadOperation.f(this.f19709b);
                return;
            case 1:
                FileUploadOperation.e(this.f19709b);
                return;
            case 2:
                FileUploadOperation.d(this.f19709b);
                return;
            default:
                FileUploadOperation.b(this.f19709b);
                return;
        }
    }
}
