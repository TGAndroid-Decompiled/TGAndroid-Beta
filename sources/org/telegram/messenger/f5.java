package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16335a;
    public final ImageLoader.HttpImageTask f16336b;
    public final Boolean f16337c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16335a = i10;
        this.f16336b = httpImageTask;
        this.f16337c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16335a) {
            case 0:
                this.f16336b.lambda$onPostExecute$3(this.f16337c);
                return;
            default:
                this.f16336b.lambda$onPostExecute$4(this.f16337c);
                return;
        }
    }
}
