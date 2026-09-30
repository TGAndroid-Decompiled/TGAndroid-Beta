package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16073a;
    public final ImageLoader.HttpFileTask f16074b;
    public final long f16075c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f16073a = i10;
        this.f16074b = httpFileTask;
        this.f16075c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16073a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f16074b, this.f16075c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f16074b, this.f16075c, this.d);
                return;
        }
    }
}
