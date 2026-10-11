package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17943a;
    public final ImageLoader.HttpImageTask f17944b;
    public final Boolean f17945c;

    public g5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17943a = i10;
        this.f17944b = httpImageTask;
        this.f17945c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17943a) {
            case 0:
                this.f17944b.lambda$onPostExecute$3(this.f17945c);
                return;
            default:
                this.f17944b.lambda$onPostExecute$4(this.f17945c);
                return;
        }
    }
}
