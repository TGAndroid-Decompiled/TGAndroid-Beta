package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16088a;
    public final ImageLoader.HttpImageTask f16089b;
    public final Boolean f16090c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16088a = i10;
        this.f16089b = httpImageTask;
        this.f16090c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16088a) {
            case 0:
                this.f16089b.lambda$onPostExecute$3(this.f16090c);
                return;
            default:
                this.f16089b.lambda$onPostExecute$4(this.f16090c);
                return;
        }
    }
}
