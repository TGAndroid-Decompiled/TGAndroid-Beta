package org.telegram.messenger;

public final class d5 implements Runnable {

    public final int f20019a;

    public final ImageLoader.HttpFileTask f20020b;

    public final long f20021c;
    public final long d;

    public d5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f20019a = i10;
        this.f20020b = httpFileTask;
        this.f20021c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20019a) {
            case 0:
                this.f20020b.lambda$reportProgress$0(this.f20021c, this.d);
                break;
            default:
                this.f20020b.lambda$reportProgress$1(this.f20021c, this.d);
                break;
        }
    }
}
