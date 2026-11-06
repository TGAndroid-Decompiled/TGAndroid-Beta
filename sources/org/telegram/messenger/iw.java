package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class iw implements Runnable {
    public final int f23344a;
    public final gz f23345b;
    public final TL_update.TL_updateNewChannelMessage f23346c;

    public iw(gz gzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i7) {
        this.f23344a = i7;
        this.f23345b = gzVar;
        this.f23346c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f23344a) {
            case 0:
                qp messagesController = this.f23345b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f23346c;
                messagesController.L3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                qp messagesController2 = this.f23345b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f23346c;
                messagesController2.L3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
