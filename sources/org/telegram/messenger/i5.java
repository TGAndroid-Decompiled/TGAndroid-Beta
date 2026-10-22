package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18582a;
    public final ImageLoader.HttpFileTask f18583b;
    public final long f18584c;
    public final long d;

    public i5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18582a = i10;
        this.f18583b = httpFileTask;
        this.f18584c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18582a) {
            case 0:
                this.f18583b.lambda$reportProgress$0(this.f18584c, this.d);
                return;
            default:
                this.f18583b.lambda$reportProgress$1(this.f18584c, this.d);
                return;
        }
    }
}
