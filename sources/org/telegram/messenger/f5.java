package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16094a;
    public final ImageLoader.HttpImageTask f16095b;
    public final Boolean f16096c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16094a = i10;
        this.f16095b = httpImageTask;
        this.f16096c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16094a) {
            case 0:
                this.f16095b.lambda$onPostExecute$3(this.f16096c);
                return;
            default:
                this.f16095b.lambda$onPostExecute$4(this.f16096c);
                return;
        }
    }
}
