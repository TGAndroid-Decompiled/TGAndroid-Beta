package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class jy implements Runnable {
    public final int f23623a;
    public final gz f23624b;
    public final TL_update.TL_updateNewChannelMessage f23625c;

    public jy(gz gzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i7) {
        this.f23623a = i7;
        this.f23624b = gzVar;
        this.f23625c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f23623a) {
            case 0:
                qp messagesController = this.f23624b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f23625c;
                messagesController.L3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                qp messagesController2 = this.f23624b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f23625c;
                messagesController2.L3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
