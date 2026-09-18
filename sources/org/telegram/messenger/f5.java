package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16272a;
    public final ImageLoader.HttpImageTask f16273b;
    public final Boolean f16274c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16272a = i10;
        this.f16273b = httpImageTask;
        this.f16274c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16272a) {
            case 0:
                this.f16273b.lambda$onPostExecute$3(this.f16274c);
                return;
            default:
                this.f16273b.lambda$onPostExecute$4(this.f16274c);
                return;
        }
    }
}
