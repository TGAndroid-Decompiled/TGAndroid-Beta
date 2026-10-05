package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17916a;
    public final ImageLoader.HttpImageTask f17917b;
    public final long f17918c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f17916a = i10;
        this.f17917b = httpImageTask;
        this.f17918c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17916a) {
            case 0:
                this.f17917b.lambda$reportProgress$0(this.f17918c, this.d);
                return;
            default:
                this.f17917b.lambda$reportProgress$1(this.f17918c, this.d);
                return;
        }
    }
}
