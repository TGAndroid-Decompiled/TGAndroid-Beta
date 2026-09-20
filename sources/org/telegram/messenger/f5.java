package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16312a;
    public final ImageLoader.HttpImageTask f16313b;
    public final Boolean f16314c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16312a = i10;
        this.f16313b = httpImageTask;
        this.f16314c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16312a) {
            case 0:
                this.f16313b.lambda$onPostExecute$3(this.f16314c);
                return;
            default:
                this.f16313b.lambda$onPostExecute$4(this.f16314c);
                return;
        }
    }
}
