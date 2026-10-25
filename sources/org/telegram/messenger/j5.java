package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f20392a;
    public final ImageLoader.HttpFileTask f20393b;
    public final long f20394c;
    public final long d;

    public j5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f20392a = i10;
        this.f20393b = httpFileTask;
        this.f20394c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20392a) {
            case 0:
                this.f20393b.lambda$reportProgress$0(this.f20394c, this.d);
                return;
            default:
                this.f20393b.lambda$reportProgress$1(this.f20394c, this.d);
                return;
        }
    }
}
