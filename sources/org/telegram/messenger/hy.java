package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class hy implements Runnable {
    public final int f22993a;
    public final gz f22994b;
    public final TL_update.TL_updateNewMessage f22995c;

    public hy(gz gzVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.f22993a = i7;
        this.f22994b = gzVar;
        this.f22995c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f22993a) {
            case 0:
                qp messagesController = this.f22994b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f22995c;
                messagesController.M3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                qp messagesController2 = this.f22994b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f22995c;
                messagesController2.M3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                qp messagesController3 = this.f22994b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f22995c;
                messagesController3.M3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
