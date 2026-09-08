package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17745a;
    public final ImageLoader.HttpImageTask f17746b;
    public final long f17747c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f17745a = i10;
        this.f17746b = httpImageTask;
        this.f17747c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17745a) {
            case 0:
                this.f17746b.lambda$reportProgress$0(this.f17747c, this.d);
                return;
            default:
                this.f17746b.lambda$reportProgress$1(this.f17747c, this.d);
                return;
        }
    }
}
