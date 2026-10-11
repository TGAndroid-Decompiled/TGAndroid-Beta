package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f17616a;
    public final ImageLoader.HttpFileTask f17617b;
    public final long f17618c;
    public final long d;

    public d5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17616a = i10;
        this.f17617b = httpFileTask;
        this.f17618c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17616a) {
            case 0:
                this.f17617b.lambda$reportProgress$0(this.f17618c, this.d);
                return;
            default:
                this.f17617b.lambda$reportProgress$1(this.f17618c, this.d);
                return;
        }
    }
}
