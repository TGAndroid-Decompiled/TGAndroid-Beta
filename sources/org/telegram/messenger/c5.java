package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f17501a;
    public final ImageLoader.HttpFileTask f17502b;
    public final long f17503c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17501a = i10;
        this.f17502b = httpFileTask;
        this.f17503c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17501a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f17502b, this.f17503c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f17502b, this.f17503c, this.d);
                return;
        }
    }
}
