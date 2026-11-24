package defpackage;

import org.telegram.tgnet.tl.TL_update;
public final class c3a implements Runnable {
    public final byte a;
    public final z3a b;
    public final TL_update.TL_updateNewChannelMessage c;

    public c3a(z3a z3aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().N3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
            default:
                z3aVar.getMessagesController().N3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                return;
        }
    }
}
