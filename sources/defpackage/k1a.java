package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class k1a implements Runnable {
    public final byte a;
    public final z3a b;
    public final TL_update.TL_updateNewChannelMessage c;
    public final long d;

    public k1a(z3a z3aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = tL_updateNewChannelMessage;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
                z3aVar.getMessagesStorage().Z1(-j, arrayList, true, -1, 0, false, null);
                return;
            default:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
                z3aVar.getMessagesStorage().Z1(-j, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
