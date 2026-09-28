package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16435a;
    public final ImageLoader.HttpImageTask f16436b;
    public final long f16437c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16435a = i10;
        this.f16436b = httpImageTask;
        this.f16437c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16435a) {
            case 0:
                this.f16436b.lambda$reportProgress$0(this.f16437c, this.d);
                return;
            default:
                this.f16436b.lambda$reportProgress$1(this.f16437c, this.d);
                return;
        }
    }
}
