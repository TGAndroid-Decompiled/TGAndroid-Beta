package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class dw implements Runnable {
    public final int f23622a;
    public final az f23623b;
    public final TL_update.TL_updateNewChannelMessage f23624c;
    public final long d;

    public dw(az azVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.f23622a = i7;
        this.f23623b = azVar;
        this.f23624c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f23622a) {
            case 0:
                az azVar = this.f23623b;
                azVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f23624c.message.f28455id));
                azVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                az azVar2 = this.f23623b;
                azVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f23624c.message.f28455id));
                azVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
