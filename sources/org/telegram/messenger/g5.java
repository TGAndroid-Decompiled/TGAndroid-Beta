package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16186a;
    public final ImageLoader.HttpImageTask f16187b;
    public final long f16188c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16186a = i10;
        this.f16187b = httpImageTask;
        this.f16188c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16186a) {
            case 0:
                this.f16187b.lambda$reportProgress$0(this.f16188c, this.d);
                return;
            default:
                this.f16187b.lambda$reportProgress$1(this.f16188c, this.d);
                return;
        }
    }
}
