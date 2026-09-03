package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18826a;
    public final ImageLoader.HttpImageTask f18827b;
    public final Boolean f18828c;

    public h5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18826a = i10;
        this.f18827b = httpImageTask;
        this.f18828c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18826a) {
            case 0:
                this.f18827b.lambda$onPostExecute$3(this.f18828c);
                return;
            default:
                this.f18827b.lambda$onPostExecute$4(this.f18828c);
                return;
        }
    }
}
