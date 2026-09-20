package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16029a;
    public final ImageLoader.HttpFileTask f16030b;
    public final long f16031c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f16029a = i10;
        this.f16030b = httpFileTask;
        this.f16031c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16029a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f16030b, this.f16031c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f16030b, this.f16031c, this.d);
                return;
        }
    }
}
