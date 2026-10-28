package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class o5 implements Runnable {
    public final int f20832a;
    public final ImageLoader.HttpImageTask f20833b;
    public final long f20834c;
    public final long d;

    public o5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f20832a = i10;
        this.f20833b = httpImageTask;
        this.f20834c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20832a) {
            case 0:
                this.f20833b.lambda$reportProgress$0(this.f20834c, this.d);
                return;
            default:
                this.f20833b.lambda$reportProgress$1(this.f20834c, this.d);
                return;
        }
    }
}
