package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class sy implements Runnable {
    public final int f18182a;
    public final rz f18183b;
    public final TL_update.TL_updateNewMessage f18184c;

    public sy(rz rzVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18182a = i10;
        this.f18183b = rzVar;
        this.f18184c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18182a) {
            case 0:
                wp messagesController = this.f18183b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f18184c;
                messagesController.J3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                wp messagesController2 = this.f18183b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f18184c;
                messagesController2.J3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                wp messagesController3 = this.f18183b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f18184c;
                messagesController3.J3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
