package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f17245a;
    public final ImageLoader.HttpImageTask f17246b;
    public final Boolean f17247c;

    public j5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17245a = i10;
        this.f17246b = httpImageTask;
        this.f17247c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17245a) {
            case 0:
                this.f17246b.lambda$onPostExecute$3(this.f17247c);
                return;
            default:
                this.f17246b.lambda$onPostExecute$4(this.f17247c);
                return;
        }
    }
}
