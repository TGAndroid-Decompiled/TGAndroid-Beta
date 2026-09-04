package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17718a;
    public final ImageLoader.HttpImageTask f17719b;
    public final long f17720c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f17718a = i10;
        this.f17719b = httpImageTask;
        this.f17720c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17718a) {
            case 0:
                this.f17719b.lambda$reportProgress$0(this.f17720c, this.d);
                return;
            default:
                this.f17719b.lambda$reportProgress$1(this.f17720c, this.d);
                return;
        }
    }
}
