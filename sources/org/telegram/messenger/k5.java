package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18036a;
    public final ImageLoader.HttpImageTask f18037b;
    public final long f18038c;
    public final long d;

    public k5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f18036a = i10;
        this.f18037b = httpImageTask;
        this.f18038c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18036a) {
            case 0:
                this.f18037b.lambda$reportProgress$0(this.f18038c, this.d);
                return;
            default:
                this.f18037b.lambda$reportProgress$1(this.f18038c, this.d);
                return;
        }
    }
}
