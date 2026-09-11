package org.telegram.messenger;
public final class r3 implements Runnable {
    public final int f18867a;
    public final FileUploadOperation f18868b;

    public r3(FileUploadOperation fileUploadOperation, int i10) {
        this.f18867a = i10;
        this.f18868b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18867a) {
            case 0:
                FileUploadOperation.f(this.f18868b);
                return;
            case 1:
                FileUploadOperation.e(this.f18868b);
                return;
            case 2:
                FileUploadOperation.d(this.f18868b);
                return;
            default:
                FileUploadOperation.b(this.f18868b);
                return;
        }
    }
}
