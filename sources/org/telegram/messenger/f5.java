package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17813a;
    public final ImageLoader.HttpImageTask f17814b;
    public final Boolean f17815c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17813a = i10;
        this.f17814b = httpImageTask;
        this.f17815c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17813a) {
            case 0:
                this.f17814b.lambda$onPostExecute$3(this.f17815c);
                return;
            default:
                this.f17814b.lambda$onPostExecute$4(this.f17815c);
                return;
        }
    }
}
