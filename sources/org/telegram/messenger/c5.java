package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f17333a;
    public final ImageLoader.HttpFileTask f17334b;
    public final long f17335c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17333a = i10;
        this.f17334b = httpFileTask;
        this.f17335c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17333a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f17334b, this.f17335c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f17334b, this.f17335c, this.d);
                return;
        }
    }
}
