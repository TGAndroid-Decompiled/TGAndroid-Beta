package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aw implements Runnable {
    public final int f21593a;
    public final yy f21594b;
    public final TL_update.TL_updateNewChannelMessage f21595c;

    public aw(yy yyVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i3) {
        this.f21593a = i3;
        this.f21594b = yyVar;
        this.f21595c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f21593a) {
            case 0:
                hp messagesController = this.f21594b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f21595c;
                messagesController.L3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                hp messagesController2 = this.f21594b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f21595c;
                messagesController2.L3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
