package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f17451a;
    public final ImageLoader.HttpImageTask f17452b;
    public final long f17453c;
    public final long d;

    public i5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f17451a = i10;
        this.f17452b = httpImageTask;
        this.f17453c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17451a) {
            case 0:
                this.f17452b.lambda$reportProgress$0(this.f17453c, this.d);
                return;
            default:
                this.f17452b.lambda$reportProgress$1(this.f17453c, this.d);
                return;
        }
    }
}
