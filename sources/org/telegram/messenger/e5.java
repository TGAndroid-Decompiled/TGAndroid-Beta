package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f18540a;
    public final ImageLoader.HttpFileTask f18541b;
    public final long f18542c;
    public final long d;

    public e5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18540a = i10;
        this.f18541b = httpFileTask;
        this.f18542c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18540a) {
            case 0:
                this.f18541b.lambda$reportProgress$0(this.f18542c, this.d);
                return;
            default:
                this.f18541b.lambda$reportProgress$1(this.f18542c, this.d);
                return;
        }
    }
}
