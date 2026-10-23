package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18748a;
    public final ImageLoader.HttpImageTask f18749b;
    public final Boolean f18750c;

    public k5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18748a = i10;
        this.f18749b = httpImageTask;
        this.f18750c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18748a) {
            case 0:
                this.f18749b.lambda$onPostExecute$3(this.f18750c);
                return;
            default:
                this.f18749b.lambda$onPostExecute$4(this.f18750c);
                return;
        }
    }
}
