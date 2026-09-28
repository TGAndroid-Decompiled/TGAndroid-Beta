package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16346a;
    public final ImageLoader.HttpImageTask f16347b;
    public final Boolean f16348c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16346a = i10;
        this.f16347b = httpImageTask;
        this.f16348c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16346a) {
            case 0:
                this.f16347b.lambda$onPostExecute$3(this.f16348c);
                return;
            default:
                this.f16347b.lambda$onPostExecute$4(this.f16348c);
                return;
        }
    }
}
