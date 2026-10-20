package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18754a;
    public final ImageLoader.HttpImageTask f18755b;
    public final Boolean f18756c;

    public k5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18754a = i10;
        this.f18755b = httpImageTask;
        this.f18756c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18754a) {
            case 0:
                this.f18755b.lambda$onPostExecute$3(this.f18756c);
                return;
            default:
                this.f18755b.lambda$onPostExecute$4(this.f18756c);
                return;
        }
    }
}
