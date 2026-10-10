package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17908a;
    public final ImageLoader.HttpImageTask f17909b;
    public final Boolean f17910c;

    public g5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17908a = i10;
        this.f17909b = httpImageTask;
        this.f17910c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17908a) {
            case 0:
                this.f17909b.lambda$onPostExecute$3(this.f17910c);
                return;
            default:
                this.f17909b.lambda$onPostExecute$4(this.f17910c);
                return;
        }
    }
}
