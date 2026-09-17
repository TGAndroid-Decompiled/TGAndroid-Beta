package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f17224a;
    public final ImageLoader.HttpFileTask f17225b;
    public final long f17226c;
    public final long d;

    public b5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17224a = i10;
        this.f17225b = httpFileTask;
        this.f17226c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17224a) {
            case 0:
                ImageLoader.HttpFileTask.b(this.f17225b, this.f17226c, this.d);
                return;
            default:
                ImageLoader.HttpFileTask.a(this.f17225b, this.f17226c, this.d);
                return;
        }
    }
}
