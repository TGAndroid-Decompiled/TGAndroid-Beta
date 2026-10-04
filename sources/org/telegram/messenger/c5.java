package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f17503a;
    public final ImageLoader.HttpFileTask f17504b;
    public final long f17505c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17503a = i10;
        this.f17504b = httpFileTask;
        this.f17505c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17503a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f17504b, this.f17505c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f17504b, this.f17505c, this.d);
                return;
        }
    }
}
