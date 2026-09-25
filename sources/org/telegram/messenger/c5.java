package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16056a;
    public final ImageLoader.HttpFileTask f16057b;
    public final long f16058c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f16056a = i10;
        this.f16057b = httpFileTask;
        this.f16058c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16056a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f16057b, this.f16058c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f16057b, this.f16058c, this.d);
                return;
        }
    }
}
