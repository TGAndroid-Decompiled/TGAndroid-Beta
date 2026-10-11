package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18017a;
    public final ImageLoader.HttpImageTask f18018b;
    public final long f18019c;
    public final long d;

    public h5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f18017a = i10;
        this.f18018b = httpImageTask;
        this.f18019c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18017a) {
            case 0:
                this.f18018b.lambda$reportProgress$0(this.f18019c, this.d);
                return;
            default:
                this.f18018b.lambda$reportProgress$1(this.f18019c, this.d);
                return;
        }
    }
}
