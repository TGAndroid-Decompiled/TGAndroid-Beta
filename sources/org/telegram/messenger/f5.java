package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16080a;
    public final ImageLoader.HttpImageTask f16081b;
    public final Boolean f16082c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16080a = i10;
        this.f16081b = httpImageTask;
        this.f16082c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16080a) {
            case 0:
                this.f16081b.lambda$onPostExecute$3(this.f16082c);
                return;
            default:
                this.f16081b.lambda$onPostExecute$4(this.f16082c);
                return;
        }
    }
}
