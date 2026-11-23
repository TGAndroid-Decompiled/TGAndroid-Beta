package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class cy implements Runnable {
    public final int f23351a;
    public final az f23352b;
    public final TL_update.TL_updateNewMessage f23353c;

    public cy(az azVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.f23351a = i7;
        this.f23352b = azVar;
        this.f23353c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f23351a) {
            case 0:
                np messagesController = this.f23352b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f23353c;
                messagesController.T3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                np messagesController2 = this.f23352b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f23353c;
                messagesController2.T3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                np messagesController3 = this.f23352b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f23353c;
                messagesController3.T3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
