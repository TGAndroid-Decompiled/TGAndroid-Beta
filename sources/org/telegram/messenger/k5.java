package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18764a;
    public final ImageLoader.HttpImageTask f18765b;
    public final long f18766c;
    public final long d;

    public k5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18764a = i10;
        this.f18765b = httpImageTask;
        this.f18766c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18764a) {
            case 0:
                this.f18765b.lambda$reportProgress$0(this.f18766c, this.d);
                return;
            default:
                this.f18765b.lambda$reportProgress$1(this.f18766c, this.d);
                return;
        }
    }
}
