package defpackage;

import org.telegram.tgnet.tl.TL_update;
public final class e5a implements Runnable {
    public final byte a;
    public final a6a b;
    public final TL_update.TL_updateNewChannelMessage c;

    public e5a(a6a a6aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().Q3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                a6aVar.getMessagesController().Q3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
        }
    }
}
