package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f17363a;
    public final ImageLoader.HttpImageTask f17364b;
    public final Boolean f17365c;

    public h5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17363a = i10;
        this.f17364b = httpImageTask;
        this.f17365c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17363a) {
            case 0:
                this.f17364b.lambda$onPostExecute$3(this.f17365c);
                return;
            default:
                this.f17364b.lambda$onPostExecute$4(this.f17365c);
                return;
        }
    }
}
