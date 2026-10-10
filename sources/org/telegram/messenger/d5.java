package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f17620a;
    public final ImageLoader.HttpFileTask f17621b;
    public final long f17622c;
    public final long d;

    public d5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.f17620a = i10;
        this.f17621b = httpFileTask;
        this.f17622c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17620a) {
            case 0:
                this.f17621b.lambda$reportProgress$0(this.f17622c, this.d);
                return;
            default:
                this.f17621b.lambda$reportProgress$1(this.f17622c, this.d);
                return;
        }
    }
}
