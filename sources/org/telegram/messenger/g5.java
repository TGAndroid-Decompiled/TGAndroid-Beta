package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17651a;
    public final ImageLoader.HttpFileTask f17652b;
    public final long f17653c;
    public final long d;

    public g5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17651a = i10;
        this.f17652b = httpFileTask;
        this.f17653c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17651a) {
            case 0:
                this.f17652b.lambda$reportProgress$0(this.f17653c, this.d);
                return;
            default:
                this.f17652b.lambda$reportProgress$1(this.f17653c, this.d);
                return;
        }
    }
}
