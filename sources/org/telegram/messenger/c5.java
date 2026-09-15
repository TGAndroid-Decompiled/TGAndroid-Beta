package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f15808a;
    public final ImageLoader.HttpFileTask f15809b;
    public final long f15810c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f15808a = i10;
        this.f15809b = httpFileTask;
        this.f15810c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15808a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f15809b, this.f15810c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f15809b, this.f15810c, this.d);
                return;
        }
    }
}
