package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ay implements Runnable {
    public final int f23010a;
    public final zy f23011b;
    public final TL_update.TL_updateNewMessage f23012c;

    public ay(zy zyVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.f23010a = i7;
        this.f23011b = zyVar;
        this.f23012c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f23010a) {
            case 0:
                mp messagesController = this.f23011b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f23012c;
                messagesController.T3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                mp messagesController2 = this.f23011b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f23012c;
                messagesController2.T3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                mp messagesController3 = this.f23011b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f23012c;
                messagesController3.T3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
