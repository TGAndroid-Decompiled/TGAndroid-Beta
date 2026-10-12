package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f17929a;
    public final ImageLoader.HttpImageTask f17930b;
    public final Boolean f17931c;

    public j5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17929a = i10;
        this.f17930b = httpImageTask;
        this.f17931c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17929a) {
            case 0:
                this.f17930b.lambda$onPostExecute$3(this.f17931c);
                return;
            default:
                this.f17930b.lambda$onPostExecute$4(this.f17931c);
                return;
        }
    }
}
