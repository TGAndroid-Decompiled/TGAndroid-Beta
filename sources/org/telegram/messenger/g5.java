package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16421a;
    public final ImageLoader.HttpImageTask f16422b;
    public final long f16423c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16421a = i10;
        this.f16422b = httpImageTask;
        this.f16423c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16421a) {
            case 0:
                this.f16422b.lambda$reportProgress$0(this.f16423c, this.d);
                return;
            default:
                this.f16422b.lambda$reportProgress$1(this.f16423c, this.d);
                return;
        }
    }
}
