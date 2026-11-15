package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class hy implements Runnable {
    public final int f24240a;
    public final ez f24241b;
    public final TL_update.TL_updateNewChannelMessage f24242c;

    public hy(ez ezVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i7) {
        this.f24240a = i7;
        this.f24241b = ezVar;
        this.f24242c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f24240a) {
            case 0:
                np messagesController = this.f24241b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f24242c;
                messagesController.L3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                np messagesController2 = this.f24241b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f24242c;
                messagesController2.L3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
