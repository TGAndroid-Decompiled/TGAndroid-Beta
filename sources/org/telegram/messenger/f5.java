package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17658a;
    public final ImageLoader.HttpImageTask f17659b;
    public final long f17660c;
    public final long d;

    public f5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f17658a = i10;
        this.f17659b = httpImageTask;
        this.f17660c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17658a) {
            case 0:
                this.f17659b.lambda$reportProgress$0(this.f17660c, this.d);
                return;
            default:
                this.f17659b.lambda$reportProgress$1(this.f17660c, this.d);
                return;
        }
    }
}
