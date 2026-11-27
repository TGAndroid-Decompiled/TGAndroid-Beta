package defpackage;

import org.telegram.tgnet.tl.TL_update;
public final class h5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final TL_update.TL_updateNewMessage c;

    public h5a(r7a r7aVar, TL_update.TL_updateNewMessage tL_updateNewMessage, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().W3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                r7aVar.getMessagesController().W3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            default:
                r7aVar.getMessagesController().W3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
        }
    }
}
