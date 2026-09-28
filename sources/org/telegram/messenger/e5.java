package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f16257a;
    public final ImageLoader.HttpImageTask f16258b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f16257a = i10;
        this.f16258b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f16257a) {
            case 0:
                this.f16258b.lambda$onCancelled$6();
                return;
            case 1:
                this.f16258b.lambda$onCancelled$8();
                return;
            case 2:
                this.f16258b.lambda$onPostExecute$5();
                return;
            default:
                this.f16258b.lambda$onCancelled$7();
                return;
        }
    }
}
