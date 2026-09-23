package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16167a;
    public final ImageLoader.HttpImageTask f16168b;
    public final long f16169c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16167a = i10;
        this.f16168b = httpImageTask;
        this.f16169c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16167a) {
            case 0:
                this.f16168b.lambda$reportProgress$0(this.f16169c, this.d);
                return;
            default:
                this.f16168b.lambda$reportProgress$1(this.f16169c, this.d);
                return;
        }
    }
}
