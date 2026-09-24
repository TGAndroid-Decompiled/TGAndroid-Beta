package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16411a;
    public final ImageLoader.HttpImageTask f16412b;
    public final long f16413c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16411a = i10;
        this.f16412b = httpImageTask;
        this.f16413c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16411a) {
            case 0:
                this.f16412b.lambda$reportProgress$0(this.f16413c, this.d);
                return;
            default:
                this.f16412b.lambda$reportProgress$1(this.f16413c, this.d);
                return;
        }
    }
}
