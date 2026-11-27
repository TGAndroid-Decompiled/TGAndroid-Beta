package defpackage;

import org.telegram.tgnet.tl.TL_update;
public final class i5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final TL_update.TL_updateNewChannelMessage c;

    public i5a(r7a r7aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().V3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                r7aVar.getMessagesController().V3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
        }
    }
}
