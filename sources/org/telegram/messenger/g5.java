package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16434a;
    public final ImageLoader.HttpImageTask f16435b;
    public final long f16436c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16434a = i10;
        this.f16435b = httpImageTask;
        this.f16436c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16434a) {
            case 0:
                this.f16435b.lambda$reportProgress$0(this.f16436c, this.d);
                return;
            default:
                this.f16435b.lambda$reportProgress$1(this.f16436c, this.d);
                return;
        }
    }
}
