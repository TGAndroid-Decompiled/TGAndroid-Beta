package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class dw implements Runnable {
    public final int f23586a;
    public final az f23587b;
    public final TL_update.TL_updateNewChannelMessage f23588c;
    public final long d;

    public dw(az azVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.f23586a = i7;
        this.f23587b = azVar;
        this.f23588c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f23586a) {
            case 0:
                az azVar = this.f23587b;
                azVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f23588c.message.f28419id));
                azVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                az azVar2 = this.f23587b;
                azVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f23588c.message.f28419id));
                azVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
