package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f19996a;
    public final ImageLoader.HttpFileTask f19997b;
    public final long f19998c;
    public final long d;

    public d5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f19996a = i10;
        this.f19997b = httpFileTask;
        this.f19998c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19996a) {
            case 0:
                this.f19997b.lambda$reportProgress$0(this.f19998c, this.d);
                return;
            default:
                this.f19997b.lambda$reportProgress$1(this.f19998c, this.d);
                return;
        }
    }
}
