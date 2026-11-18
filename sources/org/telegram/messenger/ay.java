package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ay implements Runnable {
    public final int f22982a;
    public final zy f22983b;
    public final TL_update.TL_updateNewMessage f22984c;

    public ay(zy zyVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.f22982a = i7;
        this.f22983b = zyVar;
        this.f22984c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f22982a) {
            case 0:
                mp messagesController = this.f22983b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f22984c;
                messagesController.T3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                mp messagesController2 = this.f22983b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f22984c;
                messagesController2.T3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                mp messagesController3 = this.f22983b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f22984c;
                messagesController3.T3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
