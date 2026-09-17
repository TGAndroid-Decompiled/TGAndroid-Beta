package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17558a;
    public final ImageLoader.HttpImageTask f17559b;
    public final Boolean f17560c;

    public e5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17558a = i10;
        this.f17559b = httpImageTask;
        this.f17560c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17558a) {
            case 0:
                this.f17559b.lambda$onPostExecute$3(this.f17560c);
                return;
            default:
                this.f17559b.lambda$onPostExecute$4(this.f17560c);
                return;
        }
    }
}
