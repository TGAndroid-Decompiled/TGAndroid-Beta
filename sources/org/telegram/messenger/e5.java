package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17531a;
    public final ImageLoader.HttpImageTask f17532b;
    public final Boolean f17533c;

    public e5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17531a = i10;
        this.f17532b = httpImageTask;
        this.f17533c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17531a) {
            case 0:
                this.f17532b.lambda$onPostExecute$3(this.f17533c);
                return;
            default:
                this.f17532b.lambda$onPostExecute$4(this.f17533c);
                return;
        }
    }
}
