package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f18679a;
    public final ImageLoader.HttpImageTask f18680b;
    public final long f18681c;
    public final long d;

    public j5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18679a = i10;
        this.f18680b = httpImageTask;
        this.f18681c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18679a) {
            case 0:
                this.f18680b.lambda$reportProgress$0(this.f18681c, this.d);
                return;
            default:
                this.f18680b.lambda$reportProgress$1(this.f18681c, this.d);
                return;
        }
    }
}
