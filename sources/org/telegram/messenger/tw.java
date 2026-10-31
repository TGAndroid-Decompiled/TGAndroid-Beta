package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class tw implements Runnable {
    public final int f18114a;
    public final qz f18115b;
    public final TL_update.TL_updateNewChannelMessage f18116c;

    public tw(qz qzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18114a = i10;
        this.f18115b = qzVar;
        this.f18116c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18114a) {
            case 0:
                vp messagesController = this.f18115b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f18116c;
                messagesController.I3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                vp messagesController2 = this.f18115b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f18116c;
                messagesController2.I3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
