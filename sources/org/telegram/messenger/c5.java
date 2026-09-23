package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f15798a;
    public final ImageLoader.HttpFileTask f15799b;
    public final long f15800c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f15798a = i10;
        this.f15799b = httpFileTask;
        this.f15800c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15798a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f15799b, this.f15800c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f15799b, this.f15800c, this.d);
                return;
        }
    }
}
