package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f17652a;
    public final ImageLoader.HttpFileTask f17653b;
    public final long f17654c;
    public final long d;

    public d5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17652a = i10;
        this.f17653b = httpFileTask;
        this.f17654c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17652a) {
            case 0:
                this.f17653b.lambda$reportProgress$0(this.f17654c, this.d);
                return;
            default:
                this.f17653b.lambda$reportProgress$1(this.f17654c, this.d);
                return;
        }
    }
}
