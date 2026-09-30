package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16347a;
    public final ImageLoader.HttpImageTask f16348b;
    public final Boolean f16349c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16347a = i10;
        this.f16348b = httpImageTask;
        this.f16349c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16347a) {
            case 0:
                this.f16348b.lambda$onPostExecute$3(this.f16349c);
                return;
            default:
                this.f16348b.lambda$onPostExecute$4(this.f16349c);
                return;
        }
    }
}
