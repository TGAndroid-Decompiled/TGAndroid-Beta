package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17085a;
    public final ImageLoader.HttpFileTask f17086b;
    public final long f17087c;
    public final long d;

    public e5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f17085a = i10;
        this.f17086b = httpFileTask;
        this.f17087c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17085a) {
            case 0:
                this.f17086b.lambda$reportProgress$0(this.f17087c, this.d);
                return;
            default:
                this.f17086b.lambda$reportProgress$1(this.f17087c, this.d);
                return;
        }
    }
}
