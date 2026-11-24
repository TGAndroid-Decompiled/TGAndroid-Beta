package defpackage;

import org.telegram.tgnet.tl.TL_update;
public final class d5a implements Runnable {
    public final byte a;
    public final a6a b;
    public final TL_update.TL_updateNewMessage c;

    public d5a(a6a a6aVar, TL_update.TL_updateNewMessage tL_updateNewMessage, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().R3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                a6aVar.getMessagesController().R3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            default:
                a6aVar.getMessagesController().R3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
        }
    }
}
