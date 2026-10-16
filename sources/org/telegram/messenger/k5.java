package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f17358a;
    public final ImageLoader.HttpImageTask f17359b;
    public final long f17360c;
    public final long d;

    public k5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f17358a = i10;
        this.f17359b = httpImageTask;
        this.f17360c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17358a) {
            case 0:
                this.f17359b.lambda$reportProgress$0(this.f17360c, this.d);
                return;
            default:
                this.f17359b.lambda$reportProgress$1(this.f17360c, this.d);
                return;
        }
    }
}
