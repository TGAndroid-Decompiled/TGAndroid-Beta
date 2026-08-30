package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17100a;
    public final ImageLoader.HttpFileTask f17101b;
    public final long f17102c;
    public final long d;

    public e5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f17100a = i10;
        this.f17101b = httpFileTask;
        this.f17102c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17100a) {
            case 0:
                this.f17101b.lambda$reportProgress$0(this.f17102c, this.d);
                return;
            default:
                this.f17101b.lambda$reportProgress$1(this.f17102c, this.d);
                return;
        }
    }
}
