package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18053a;
    public final ImageLoader.HttpImageTask f18054b;
    public final long f18055c;
    public final long d;

    public h5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f18053a = i10;
        this.f18054b = httpImageTask;
        this.f18055c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18053a) {
            case 0:
                this.f18054b.lambda$reportProgress$0(this.f18055c, this.d);
                return;
            default:
                this.f18054b.lambda$reportProgress$1(this.f18055c, this.d);
                return;
        }
    }
}
