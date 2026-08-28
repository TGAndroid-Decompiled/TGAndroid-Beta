package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f20153a;
    public final ImageLoader.HttpImageTask f20154b;
    public final Boolean f20155c;

    public e5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i9) {
        this.f20153a = i9;
        this.f20154b = httpImageTask;
        this.f20155c = bool;
    }

    @Override
    public final void run() {
        switch (this.f20153a) {
            case 0:
                this.f20154b.lambda$onPostExecute$3(this.f20155c);
                return;
            default:
                this.f20154b.lambda$onPostExecute$4(this.f20155c);
                return;
        }
    }
}
