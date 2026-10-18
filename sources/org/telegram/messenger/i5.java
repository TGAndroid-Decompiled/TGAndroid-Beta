package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18578a;
    public final ImageLoader.HttpImageTask f18579b;
    public final Boolean f18580c;

    public i5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18578a = i10;
        this.f18579b = httpImageTask;
        this.f18580c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18578a) {
            case 0:
                this.f18579b.lambda$onPostExecute$3(this.f18580c);
                return;
            default:
                this.f18579b.lambda$onPostExecute$4(this.f18580c);
                return;
        }
    }
}
