package org.telegram.messenger;

public final class h5 implements Runnable {

    public final int f20446a;

    public final ImageLoader.HttpImageTask f20447b;

    public final long f20448c;
    public final long d;

    public h5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f20446a = i10;
        this.f20447b = httpImageTask;
        this.f20448c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20446a) {
            case 0:
                this.f20447b.lambda$reportProgress$0(this.f20448c, this.d);
                break;
            default:
                this.f20447b.lambda$reportProgress$1(this.f20448c, this.d);
                break;
        }
    }
}
