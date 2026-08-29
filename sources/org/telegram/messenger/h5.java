package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f20410a;
    public final ImageLoader.HttpImageTask f20411b;
    public final long f20412c;
    public final long d;

    public h5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f20410a = i10;
        this.f20411b = httpImageTask;
        this.f20412c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20410a) {
            case 0:
                this.f20411b.lambda$reportProgress$0(this.f20412c, this.d);
                return;
            default:
                this.f20411b.lambda$reportProgress$1(this.f20412c, this.d);
                return;
        }
    }
}
