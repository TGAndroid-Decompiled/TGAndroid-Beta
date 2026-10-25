package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class n5 implements Runnable {
    public final int f20740a;
    public final ImageLoader.HttpImageTask f20741b;
    public final long f20742c;
    public final long d;

    public n5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f20740a = i10;
        this.f20741b = httpImageTask;
        this.f20742c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20740a) {
            case 0:
                this.f20741b.lambda$reportProgress$0(this.f20742c, this.d);
                return;
            default:
                this.f20741b.lambda$reportProgress$1(this.f20742c, this.d);
                return;
        }
    }
}
