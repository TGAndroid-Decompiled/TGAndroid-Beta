package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f17504a;
    public final ImageLoader.HttpFileTask f17505b;
    public final long f17506c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17504a = i10;
        this.f17505b = httpFileTask;
        this.f17506c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17504a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f17505b, this.f17506c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f17505b, this.f17506c, this.d);
                return;
        }
    }
}
