package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class m5 implements Runnable {
    public final int f18939a;
    public final ImageLoader.HttpImageTask f18940b;
    public final long f18941c;
    public final long d;

    public m5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18939a = i10;
        this.f18940b = httpImageTask;
        this.f18941c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18939a) {
            case 0:
                this.f18940b.lambda$reportProgress$0(this.f18941c, this.d);
                return;
            default:
                this.f18940b.lambda$reportProgress$1(this.f18941c, this.d);
                return;
        }
    }
}
