package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f17928a;
    public final ImageLoader.HttpImageTask f17929b;
    public final Boolean f17930c;

    public j5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f17928a = i10;
        this.f17929b = httpImageTask;
        this.f17930c = bool;
    }

    @Override
    public final void run() {
        switch (this.f17928a) {
            case 0:
                this.f17929b.lambda$onPostExecute$3(this.f17930c);
                return;
            default:
                this.f17929b.lambda$onPostExecute$4(this.f17930c);
                return;
        }
    }
}
