package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f15996a;
    public final ImageLoader.HttpFileTask f15997b;
    public final long f15998c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f15996a = i10;
        this.f15997b = httpFileTask;
        this.f15998c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15996a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f15997b, this.f15998c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f15997b, this.f15998c, this.d);
                return;
        }
    }
}
