package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f17343a;
    public final ImageLoader.HttpImageTask f17344b;
    public final Boolean f17345c;

    public h5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17343a = i10;
        this.f17344b = httpImageTask;
        this.f17345c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17343a) {
            case 0:
                this.f17344b.lambda$onPostExecute$3(this.f17345c);
                return;
            default:
                this.f17344b.lambda$onPostExecute$4(this.f17345c);
                return;
        }
    }
}
