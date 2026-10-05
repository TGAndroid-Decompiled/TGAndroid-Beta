package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17818a;
    public final ImageLoader.HttpImageTask f17819b;
    public final Boolean f17820c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17818a = i10;
        this.f17819b = httpImageTask;
        this.f17820c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                this.f17819b.lambda$onPostExecute$3(this.f17820c);
                return;
            default:
                this.f17819b.lambda$onPostExecute$4(this.f17820c);
                return;
        }
    }
}
