package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f17659a;
    public final ImageLoader.HttpImageTask f17660b;
    public final long f17661c;
    public final long d;

    public k5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f17659a = i10;
        this.f17660b = httpImageTask;
        this.f17661c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17659a) {
            case 0:
                this.f17660b.lambda$reportProgress$0(this.f17661c, this.d);
                return;
            default:
                this.f17660b.lambda$reportProgress$1(this.f17661c, this.d);
                return;
        }
    }
}
