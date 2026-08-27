package org.telegram.messenger;

public final class t3 implements Runnable {

    public final int f21601a;

    public final FileUploadOperation f21602b;

    public final int[] f21603c;

    public t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f21601a = i10;
        this.f21602b = fileUploadOperation;
        this.f21603c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f21601a) {
            case 0:
                this.f21602b.lambda$startUploadRequest$5(this.f21603c);
                break;
            default:
                this.f21602b.lambda$startUploadRequest$9(this.f21603c);
                break;
        }
    }
}
