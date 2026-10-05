package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f17506a;
    public final ImageLoader.HttpFileTask f17507b;
    public final long f17508c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17506a = i10;
        this.f17507b = httpFileTask;
        this.f17508c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17506a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f17507b, this.f17508c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f17507b, this.f17508c, this.d);
                return;
        }
    }
}
