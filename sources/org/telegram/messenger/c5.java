package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f15804a;
    public final ImageLoader.HttpFileTask f15805b;
    public final long f15806c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f15804a = i10;
        this.f15805b = httpFileTask;
        this.f15806c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15804a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f15805b, this.f15806c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f15805b, this.f15806c, this.d);
                return;
        }
    }
}
