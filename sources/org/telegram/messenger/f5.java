package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f18345a;
    public final ImageLoader.HttpFileTask f18346b;
    public final long f18347c;
    public final long d;

    public f5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18345a = i10;
        this.f18346b = httpFileTask;
        this.f18347c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18345a) {
            case 0:
                this.f18346b.lambda$reportProgress$0(this.f18347c, this.d);
                return;
            default:
                this.f18346b.lambda$reportProgress$1(this.f18347c, this.d);
                return;
        }
    }
}
