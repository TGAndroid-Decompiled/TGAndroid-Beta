package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f20303a;
    public final ImageLoader.HttpImageTask f20304b;
    public final Boolean f20305c;

    public g5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f20303a = i10;
        this.f20304b = httpImageTask;
        this.f20305c = bool;
    }

    @Override
    public final void run() {
        switch (this.f20303a) {
            case 0:
                this.f20304b.lambda$onPostExecute$3(this.f20305c);
                return;
            default:
                this.f20304b.lambda$onPostExecute$4(this.f20305c);
                return;
        }
    }
}
