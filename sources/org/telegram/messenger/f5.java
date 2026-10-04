package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17819a;
    public final ImageLoader.HttpImageTask f17820b;
    public final Boolean f17821c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17819a = i10;
        this.f17820b = httpImageTask;
        this.f17821c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17819a) {
            case 0:
                this.f17820b.lambda$onPostExecute$3(this.f17821c);
                return;
            default:
                this.f17820b.lambda$onPostExecute$4(this.f17821c);
                return;
        }
    }
}
