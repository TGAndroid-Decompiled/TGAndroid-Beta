package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18576a;
    public final ImageLoader.HttpFileTask f18577b;
    public final long f18578c;
    public final long d;

    public h5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18576a = i10;
        this.f18577b = httpFileTask;
        this.f18578c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18576a) {
            case 0:
                this.f18577b.lambda$reportProgress$0(this.f18578c, this.d);
                return;
            default:
                this.f18577b.lambda$reportProgress$1(this.f18578c, this.d);
                return;
        }
    }
}
