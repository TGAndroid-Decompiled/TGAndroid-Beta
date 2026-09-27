package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16050a;
    public final ImageLoader.HttpFileTask f16051b;
    public final long f16052c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f16050a = i10;
        this.f16051b = httpFileTask;
        this.f16052c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16050a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f16051b, this.f16052c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f16051b, this.f16052c, this.d);
                return;
        }
    }
}
