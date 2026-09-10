package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f15501a;
    public final ImageLoader.HttpImageTask f15502b;

    public j5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f15501a = i10;
        this.f15502b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f15501a) {
            case 0:
                this.f15502b.lambda$onCancelled$6();
                return;
            case 1:
                this.f15502b.lambda$onCancelled$8();
                return;
            case 2:
                this.f15502b.lambda$onPostExecute$5();
                return;
            default:
                this.f15502b.lambda$onCancelled$7();
                return;
        }
    }
}
