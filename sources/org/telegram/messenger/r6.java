package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17197a;
    public final MediaController.MediaLoader f17198b;
    public final int f17199c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17197a = i11;
        this.f17198b = mediaLoader;
        this.f17199c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17197a) {
            case 0:
                this.f17198b.lambda$didReceivedNotification$11(this.f17199c);
                return;
            case 1:
                this.f17198b.lambda$copyFile$9(this.f17199c);
                return;
            case 2:
                this.f17198b.lambda$copyFile$10(this.f17199c);
                return;
            default:
                this.f17198b.lambda$processLivePhotoMessage$6(this.f17199c);
                return;
        }
    }
}
