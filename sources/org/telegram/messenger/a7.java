package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class a7 implements Runnable {
    public final int f17841a;
    public final MediaController.MediaLoader f17842b;

    public a7(MediaController.MediaLoader mediaLoader, int i10) {
        this.f17841a = i10;
        this.f17842b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f17841a) {
            case 0:
                MediaController.MediaLoader.k(this.f17842b);
                return;
            case 1:
                MediaController.MediaLoader.h(this.f17842b);
                return;
            case 2:
                MediaController.MediaLoader.f(this.f17842b);
                return;
            case 3:
                MediaController.MediaLoader.d(this.f17842b);
                return;
            default:
                MediaController.MediaLoader.l(this.f17842b);
                return;
        }
    }
}
