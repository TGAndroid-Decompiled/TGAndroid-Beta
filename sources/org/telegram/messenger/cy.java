package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class cy implements Runnable {
    public final int f23435a;
    public final zy f23436b;
    public final TL_update.TL_updateNewChannelMessage f23437c;

    public cy(zy zyVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i7) {
        this.f23435a = i7;
        this.f23436b = zyVar;
        this.f23437c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f23435a) {
            case 0:
                mp messagesController = this.f23436b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f23437c;
                messagesController.S3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                mp messagesController2 = this.f23436b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f23437c;
                messagesController2.S3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
