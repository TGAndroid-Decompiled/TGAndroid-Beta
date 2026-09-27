package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16422a;
    public final ImageLoader.HttpImageTask f16423b;
    public final long f16424c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16422a = i10;
        this.f16423b = httpImageTask;
        this.f16424c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16422a) {
            case 0:
                this.f16423b.lambda$reportProgress$0(this.f16424c, this.d);
                return;
            default:
                this.f16423b.lambda$reportProgress$1(this.f16424c, this.d);
                return;
        }
    }
}
