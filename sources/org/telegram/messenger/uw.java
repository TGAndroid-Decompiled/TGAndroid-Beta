package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class uw implements Runnable {
    public final int f18483a;
    public final rz f18484b;
    public final TL_update.TL_updateNewChannelMessage f18485c;

    public uw(rz rzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18483a = i10;
        this.f18484b = rzVar;
        this.f18485c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18483a) {
            case 0:
                wp messagesController = this.f18484b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.f18485c;
                messagesController.I3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                wp messagesController2 = this.f18484b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.f18485c;
                messagesController2.I3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                return;
        }
    }
}
