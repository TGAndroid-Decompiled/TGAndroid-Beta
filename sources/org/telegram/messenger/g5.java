package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16451a;
    public final ImageLoader.HttpImageTask f16452b;
    public final long f16453c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16451a = i10;
        this.f16452b = httpImageTask;
        this.f16453c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16451a) {
            case 0:
                this.f16452b.lambda$reportProgress$0(this.f16453c, this.d);
                return;
            default:
                this.f16452b.lambda$reportProgress$1(this.f16453c, this.d);
                return;
        }
    }
}
