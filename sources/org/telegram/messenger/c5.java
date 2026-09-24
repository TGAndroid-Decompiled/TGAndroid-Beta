package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16041a;
    public final ImageLoader.HttpFileTask f16042b;
    public final long f16043c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f16041a = i10;
        this.f16042b = httpFileTask;
        this.f16043c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16041a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f16042b, this.f16043c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f16042b, this.f16043c, this.d);
                return;
        }
    }
}
