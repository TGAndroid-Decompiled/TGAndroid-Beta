package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ay implements Runnable {
    public final int f23093a;
    public final zy f23094b;
    public final TL_update.TL_updateNewMessage f23095c;

    public ay(zy zyVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.f23093a = i7;
        this.f23094b = zyVar;
        this.f23095c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f23093a) {
            case 0:
                mp messagesController = this.f23094b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f23095c;
                messagesController.T3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                mp messagesController2 = this.f23094b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f23095c;
                messagesController2.T3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                mp messagesController3 = this.f23094b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f23095c;
                messagesController3.T3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
