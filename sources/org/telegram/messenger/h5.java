package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18019a;
    public final ImageLoader.HttpImageTask f18020b;
    public final long f18021c;
    public final long d;

    public h5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f18019a = i10;
        this.f18020b = httpImageTask;
        this.f18021c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18019a) {
            case 0:
                this.f18020b.lambda$reportProgress$0(this.f18021c, this.d);
                return;
            default:
                this.f18020b.lambda$reportProgress$1(this.f18021c, this.d);
                return;
        }
    }
}
