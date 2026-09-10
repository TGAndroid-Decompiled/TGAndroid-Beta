package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f15335a;
    public final ImageLoader.HttpFileTask f15336b;
    public final long f15337c;
    public final long d;

    public h5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f15335a = i10;
        this.f15336b = httpFileTask;
        this.f15337c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15335a) {
            case 0:
                this.f15336b.lambda$reportProgress$0(this.f15337c, this.d);
                return;
            default:
                this.f15336b.lambda$reportProgress$1(this.f15337c, this.d);
                return;
        }
    }
}
