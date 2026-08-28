package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f19804a;
    public final ImageLoader.HttpFileTask f19805b;
    public final long f19806c;
    public final long d;

    public b5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i9) {
        this.f19804a = i9;
        this.f19805b = httpFileTask;
        this.f19806c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19804a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f19805b, this.f19806c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f19805b, this.f19806c, this.d);
                return;
        }
    }
}
