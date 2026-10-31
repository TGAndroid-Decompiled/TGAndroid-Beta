package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ry implements Runnable {
    public final int f17818a;
    public final qz f17819b;
    public final TL_update.TL_updateNewMessage f17820c;

    public ry(qz qzVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f17818a = i10;
        this.f17819b = qzVar;
        this.f17820c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                vp messagesController = this.f17819b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f17820c;
                messagesController.J3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                vp messagesController2 = this.f17819b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f17820c;
                messagesController2.J3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                vp messagesController3 = this.f17819b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f17820c;
                messagesController3.J3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
