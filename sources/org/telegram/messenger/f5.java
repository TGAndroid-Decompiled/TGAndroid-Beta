package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17631a;
    public final ImageLoader.HttpImageTask f17632b;
    public final long f17633c;
    public final long d;

    public f5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f17631a = i10;
        this.f17632b = httpImageTask;
        this.f17633c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17631a) {
            case 0:
                this.f17632b.lambda$reportProgress$0(this.f17633c, this.d);
                return;
            default:
                this.f17632b.lambda$reportProgress$1(this.f17633c, this.d);
                return;
        }
    }
}
