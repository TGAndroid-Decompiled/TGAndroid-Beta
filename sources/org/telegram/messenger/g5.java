package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17907a;
    public final ImageLoader.HttpImageTask f17908b;
    public final Boolean f17909c;

    public g5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17907a = i10;
        this.f17908b = httpImageTask;
        this.f17909c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17907a) {
            case 0:
                this.f17908b.lambda$onPostExecute$3(this.f17909c);
                return;
            default:
                this.f17908b.lambda$onPostExecute$4(this.f17909c);
                return;
        }
    }
}
