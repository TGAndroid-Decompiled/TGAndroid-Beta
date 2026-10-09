package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18015a;
    public final ImageLoader.HttpImageTask f18016b;
    public final long f18017c;
    public final long d;

    public h5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f18015a = i10;
        this.f18016b = httpImageTask;
        this.f18017c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18015a) {
            case 0:
                this.f18016b.lambda$reportProgress$0(this.f18017c, this.d);
                return;
            default:
                this.f18016b.lambda$reportProgress$1(this.f18017c, this.d);
                return;
        }
    }
}
