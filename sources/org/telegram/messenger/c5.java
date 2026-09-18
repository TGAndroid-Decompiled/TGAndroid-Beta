package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f15817a;
    public final ImageLoader.HttpFileTask f15818b;
    public final long f15819c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f15817a = i10;
        this.f15818b = httpFileTask;
        this.f15819c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15817a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f15818b, this.f15819c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f15818b, this.f15819c, this.d);
                return;
        }
    }
}
