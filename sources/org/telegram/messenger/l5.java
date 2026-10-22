package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class l5 implements Runnable {
    public final int f18834a;
    public final ImageLoader.HttpImageTask f18835b;
    public final Boolean f18836c;

    public l5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18834a = i10;
        this.f18835b = httpImageTask;
        this.f18836c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18834a) {
            case 0:
                this.f18835b.lambda$onPostExecute$3(this.f18836c);
                return;
            default:
                this.f18835b.lambda$onPostExecute$4(this.f18836c);
                return;
        }
    }
}
