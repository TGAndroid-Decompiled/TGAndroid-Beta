package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16363a;
    public final ImageLoader.HttpImageTask f16364b;
    public final Boolean f16365c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16363a = i10;
        this.f16364b = httpImageTask;
        this.f16365c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16363a) {
            case 0:
                this.f16364b.lambda$onPostExecute$3(this.f16365c);
                return;
            default:
                this.f16364b.lambda$onPostExecute$4(this.f16365c);
                return;
        }
    }
}
