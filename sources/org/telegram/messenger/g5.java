package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16406a;
    public final ImageLoader.HttpImageTask f16407b;
    public final long f16408c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16406a = i10;
        this.f16407b = httpImageTask;
        this.f16408c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16406a) {
            case 0:
                this.f16407b.lambda$reportProgress$0(this.f16408c, this.d);
                return;
            default:
                this.f16407b.lambda$reportProgress$1(this.f16408c, this.d);
                return;
        }
    }
}
