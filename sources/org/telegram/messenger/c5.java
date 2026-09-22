package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16044a;
    public final ImageLoader.HttpFileTask f16045b;
    public final long f16046c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f16044a = i10;
        this.f16045b = httpFileTask;
        this.f16046c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16044a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f16045b, this.f16046c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f16045b, this.f16046c, this.d);
                return;
        }
    }
}
