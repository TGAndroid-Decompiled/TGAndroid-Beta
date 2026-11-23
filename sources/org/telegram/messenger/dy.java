package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class dy implements Runnable {
    public final int f23594a;
    public final az f23595b;
    public final TL_update.TL_updateNewChannelMessage f23596c;

    public dy(az azVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i7) {
        this.f23594a = i7;
        this.f23595b = azVar;
        this.f23596c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f23594a) {
            case 0:
                np messagesController = this.f23595b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f23596c;
                messagesController.S3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                np messagesController2 = this.f23595b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f23596c;
                messagesController2.S3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
