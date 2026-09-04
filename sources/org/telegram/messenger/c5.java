package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f17306a;
    public final ImageLoader.HttpFileTask f17307b;
    public final long f17308c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17306a = i10;
        this.f17307b = httpFileTask;
        this.f17308c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17306a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f17307b, this.f17308c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f17307b, this.f17308c, this.d);
                return;
        }
    }
}
