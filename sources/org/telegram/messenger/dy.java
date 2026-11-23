package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class dy implements Runnable {
    public final int f23630a;
    public final az f23631b;
    public final TL_update.TL_updateNewChannelMessage f23632c;

    public dy(az azVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i7) {
        this.f23630a = i7;
        this.f23631b = azVar;
        this.f23632c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f23630a) {
            case 0:
                np messagesController = this.f23631b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f23632c;
                messagesController.S3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                np messagesController2 = this.f23631b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f23632c;
                messagesController2.S3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
