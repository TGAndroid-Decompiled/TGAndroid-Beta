package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16175a;
    public final ImageLoader.HttpImageTask f16176b;
    public final long f16177c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16175a = i10;
        this.f16176b = httpImageTask;
        this.f16177c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16175a) {
            case 0:
                this.f16176b.lambda$reportProgress$0(this.f16177c, this.d);
                return;
            default:
                this.f16176b.lambda$reportProgress$1(this.f16177c, this.d);
                return;
        }
    }
}
