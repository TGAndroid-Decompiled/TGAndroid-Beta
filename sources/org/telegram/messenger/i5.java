package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18575a;
    public final ImageLoader.HttpImageTask f18576b;
    public final Boolean f18577c;

    public i5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18575a = i10;
        this.f18576b = httpImageTask;
        this.f18577c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18575a) {
            case 0:
                this.f18576b.lambda$onPostExecute$3(this.f18577c);
                return;
            default:
                this.f18576b.lambda$onPostExecute$4(this.f18577c);
                return;
        }
    }
}
