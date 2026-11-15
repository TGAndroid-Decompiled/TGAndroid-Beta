package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class gy implements Runnable {
    public final int f23929a;
    public final ez f23930b;
    public final TL_update.TL_updateNewMessage f23931c;

    public gy(ez ezVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.f23929a = i7;
        this.f23930b = ezVar;
        this.f23931c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f23929a) {
            case 0:
                np messagesController = this.f23930b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f23931c;
                messagesController.M3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                np messagesController2 = this.f23930b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f23931c;
                messagesController2.M3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                np messagesController3 = this.f23930b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f23931c;
                messagesController3.M3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
