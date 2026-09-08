package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17644a;
    public final ImageLoader.HttpImageTask f17645b;
    public final Boolean f17646c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17644a = i10;
        this.f17645b = httpImageTask;
        this.f17646c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17644a) {
            case 0:
                this.f17645b.lambda$onPostExecute$3(this.f17646c);
                return;
            default:
                this.f17645b.lambda$onPostExecute$4(this.f17646c);
                return;
        }
    }
}
