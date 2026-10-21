package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18747a;
    public final ImageLoader.HttpImageTask f18748b;
    public final Boolean f18749c;

    public k5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18747a = i10;
        this.f18748b = httpImageTask;
        this.f18749c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18747a) {
            case 0:
                this.f18748b.lambda$onPostExecute$3(this.f18749c);
                return;
            default:
                this.f18748b.lambda$onPostExecute$4(this.f18749c);
                return;
        }
    }
}
