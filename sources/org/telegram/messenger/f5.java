package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17820a;
    public final ImageLoader.HttpImageTask f17821b;
    public final Boolean f17822c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17820a = i10;
        this.f17821b = httpImageTask;
        this.f17822c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17820a) {
            case 0:
                this.f17821b.lambda$onPostExecute$3(this.f17822c);
                return;
            default:
                this.f17821b.lambda$onPostExecute$4(this.f17822c);
                return;
        }
    }
}
