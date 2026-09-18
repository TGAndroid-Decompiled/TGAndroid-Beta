package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16103a;
    public final ImageLoader.HttpImageTask f16104b;
    public final Boolean f16105c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16103a = i10;
        this.f16104b = httpImageTask;
        this.f16105c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16103a) {
            case 0:
                this.f16104b.lambda$onPostExecute$3(this.f16105c);
                return;
            default:
                this.f16104b.lambda$onPostExecute$4(this.f16105c);
                return;
        }
    }
}
