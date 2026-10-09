package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17904a;
    public final ImageLoader.HttpImageTask f17905b;
    public final Boolean f17906c;

    public g5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17904a = i10;
        this.f17905b = httpImageTask;
        this.f17906c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17904a) {
            case 0:
                this.f17905b.lambda$onPostExecute$3(this.f17906c);
                return;
            default:
                this.f17905b.lambda$onPostExecute$4(this.f17906c);
                return;
        }
    }
}
