package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16359a;
    public final ImageLoader.HttpImageTask f16360b;
    public final long f16361c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16359a = i10;
        this.f16360b = httpImageTask;
        this.f16361c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16359a) {
            case 0:
                this.f16360b.lambda$reportProgress$0(this.f16361c, this.d);
                return;
            default:
                this.f16360b.lambda$reportProgress$1(this.f16361c, this.d);
                return;
        }
    }
}
