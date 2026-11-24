package defpackage;

import org.telegram.tgnet.tl.TL_update;
public final class b3a implements Runnable {
    public final byte a;
    public final z3a b;
    public final TL_update.TL_updateNewMessage c;

    public b3a(z3a z3aVar, TL_update.TL_updateNewMessage tL_updateNewMessage, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().O3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                z3aVar.getMessagesController().O3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            default:
                z3aVar.getMessagesController().O3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
        }
    }
}
