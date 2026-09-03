package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f17432a;
    public final ImageLoader.HttpImageTask f17433b;
    public final long f17434c;
    public final long d;

    public i5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f17432a = i10;
        this.f17433b = httpImageTask;
        this.f17434c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17432a) {
            case 0:
                this.f17433b.lambda$reportProgress$0(this.f17434c, this.d);
                return;
            default:
                this.f17433b.lambda$reportProgress$1(this.f17434c, this.d);
                return;
        }
    }
}
