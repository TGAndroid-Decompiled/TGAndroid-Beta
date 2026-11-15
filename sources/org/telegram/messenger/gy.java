package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class gy implements Runnable {
    public final int f23926a;
    public final ez f23927b;
    public final TL_update.TL_updateNewMessage f23928c;

    public gy(ez ezVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.f23926a = i7;
        this.f23927b = ezVar;
        this.f23928c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f23926a) {
            case 0:
                np messagesController = this.f23927b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f23928c;
                messagesController.M3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                np messagesController2 = this.f23927b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f23928c;
                messagesController2.M3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                np messagesController3 = this.f23927b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f23928c;
                messagesController3.M3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
