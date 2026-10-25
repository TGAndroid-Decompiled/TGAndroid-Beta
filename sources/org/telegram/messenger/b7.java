package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class b7 implements Runnable {
    public final int f19686a;
    public final MediaController.MediaLoader f19687b;

    public b7(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19686a = i10;
        this.f19687b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19686a) {
            case 0:
                MediaController.MediaLoader.k(this.f19687b);
                return;
            case 1:
                MediaController.MediaLoader.h(this.f19687b);
                return;
            case 2:
                MediaController.MediaLoader.f(this.f19687b);
                return;
            case 3:
                MediaController.MediaLoader.d(this.f19687b);
                return;
            default:
                MediaController.MediaLoader.l(this.f19687b);
                return;
        }
    }
}
