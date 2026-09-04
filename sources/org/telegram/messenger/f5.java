package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17617a;
    public final ImageLoader.HttpImageTask f17618b;
    public final Boolean f17619c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17617a = i10;
        this.f17618b = httpImageTask;
        this.f17619c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17617a) {
            case 0:
                this.f17618b.lambda$onPostExecute$3(this.f17619c);
                return;
            default:
                this.f17618b.lambda$onPostExecute$4(this.f17619c);
                return;
        }
    }
}
