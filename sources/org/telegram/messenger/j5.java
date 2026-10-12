package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f17550a;
    public final ImageLoader.HttpImageTask f17551b;
    public final Boolean f17552c;

    public j5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17550a = i10;
        this.f17551b = httpImageTask;
        this.f17552c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17550a) {
            case 0:
                this.f17551b.lambda$onPostExecute$3(this.f17552c);
                return;
            default:
                this.f17551b.lambda$onPostExecute$4(this.f17552c);
                return;
        }
    }
}
