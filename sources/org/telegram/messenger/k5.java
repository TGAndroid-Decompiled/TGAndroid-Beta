package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f15587a;
    public final ImageLoader.HttpImageTask f15588b;
    public final Boolean f15589c;

    public k5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f15587a = i10;
        this.f15588b = httpImageTask;
        this.f15589c = bool;
    }

    @Override
    public final void run() {
        switch (this.f15587a) {
            case 0:
                this.f15588b.lambda$onPostExecute$3(this.f15589c);
                return;
            default:
                this.f15588b.lambda$onPostExecute$4(this.f15589c);
                return;
        }
    }
}
