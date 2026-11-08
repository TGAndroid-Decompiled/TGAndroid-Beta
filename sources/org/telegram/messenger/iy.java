package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class iy implements Runnable {
    public final int f23382a;
    public final gz f23383b;
    public final TL_update.TL_updateNewMessage f23384c;

    public iy(gz gzVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.f23382a = i7;
        this.f23383b = gzVar;
        this.f23384c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f23382a) {
            case 0:
                qp messagesController = this.f23383b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f23384c;
                messagesController.M3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                qp messagesController2 = this.f23383b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f23384c;
                messagesController2.M3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                qp messagesController3 = this.f23383b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f23384c;
                messagesController3.M3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
