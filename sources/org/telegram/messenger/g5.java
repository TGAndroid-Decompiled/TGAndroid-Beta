package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17290a;
    public final ImageLoader.HttpFileTask f17291b;
    public final long f17292c;
    public final long d;

    public g5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f17290a = i10;
        this.f17291b = httpFileTask;
        this.f17292c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17290a) {
            case 0:
                this.f17291b.lambda$reportProgress$0(this.f17292c, this.d);
                return;
            default:
                this.f17291b.lambda$reportProgress$1(this.f17292c, this.d);
                return;
        }
    }
}
