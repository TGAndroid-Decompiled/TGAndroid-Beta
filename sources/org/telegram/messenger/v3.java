package org.telegram.messenger;
public final class v3 implements Runnable {
    public final int f18334a;
    public final FileUploadOperation f18335b;

    public v3(FileUploadOperation fileUploadOperation, int i10) {
        this.f18334a = i10;
        this.f18335b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18334a) {
            case 0:
                FileUploadOperation.f(this.f18335b);
                return;
            case 1:
                FileUploadOperation.e(this.f18335b);
                return;
            case 2:
                FileUploadOperation.d(this.f18335b);
                return;
            default:
                FileUploadOperation.b(this.f18335b);
                return;
        }
    }
}
