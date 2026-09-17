package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f17251a;
    public final ImageLoader.HttpFileTask f17252b;
    public final long f17253c;
    public final long d;

    public b5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17251a = i10;
        this.f17252b = httpFileTask;
        this.f17253c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17251a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f17252b, this.f17253c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f17252b, this.f17253c, this.d);
                return;
        }
    }
}
