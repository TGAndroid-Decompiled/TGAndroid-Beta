package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16426a;
    public final ImageLoader.HttpImageTask f16427b;
    public final long f16428c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16426a = i10;
        this.f16427b = httpImageTask;
        this.f16428c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16426a) {
            case 0:
                this.f16427b.lambda$reportProgress$0(this.f16428c, this.d);
                return;
            default:
                this.f16427b.lambda$reportProgress$1(this.f16428c, this.d);
                return;
        }
    }
}
