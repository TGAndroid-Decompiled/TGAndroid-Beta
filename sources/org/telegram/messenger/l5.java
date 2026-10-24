package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class l5 implements Runnable {
    public final int f18902a;
    public final ImageLoader.HttpImageTask f18903b;
    public final Boolean f18904c;

    public l5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18902a = i10;
        this.f18903b = httpImageTask;
        this.f18904c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18902a) {
            case 0:
                this.f18903b.lambda$onPostExecute$3(this.f18904c);
                return;
            default:
                this.f18903b.lambda$onPostExecute$4(this.f18904c);
                return;
        }
    }
}
