package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f20244a;
    public final ImageLoader.HttpImageTask f20245b;
    public final long f20246c;
    public final long d;

    public f5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i9) {
        this.f20244a = i9;
        this.f20245b = httpImageTask;
        this.f20246c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20244a) {
            case 0:
                this.f20245b.lambda$reportProgress$0(this.f20246c, this.d);
                return;
            default:
                this.f20245b.lambda$reportProgress$1(this.f20246c, this.d);
                return;
        }
    }
}
