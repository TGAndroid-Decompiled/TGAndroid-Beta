package org.telegram.messenger;

public final class n2 implements Runnable {

    public final int f21025a;

    public final FileLoadOperation f21026b;

    public final int f21027c;

    public n2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f21025a = i11;
        this.f21026b = fileLoadOperation;
        this.f21027c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21025a) {
            case 0:
                this.f21026b.lambda$onFail$23(this.f21027c);
                break;
            case 1:
                this.f21026b.lambda$processRequestResult$22(this.f21027c);
                break;
            case 2:
                this.f21026b.lambda$start$8(this.f21027c);
                break;
            default:
                this.f21026b.lambda$startDownloadRequest$30(this.f21027c);
                break;
        }
    }
}
