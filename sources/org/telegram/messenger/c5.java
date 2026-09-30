package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16057a;
    public final ImageLoader.HttpFileTask f16058b;
    public final long f16059c;
    public final long d;

    public c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f16057a = i10;
        this.f16058b = httpFileTask;
        this.f16059c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16057a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f16058b, this.f16059c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f16058b, this.f16059c, this.d);
                return;
        }
    }
}
