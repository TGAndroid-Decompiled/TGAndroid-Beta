package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class cw implements Runnable {
    public final int f23455a;
    public final zy f23456b;
    public final TL_update.TL_updateNewChannelMessage f23457c;
    public final long d;

    public cw(zy zyVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.f23455a = i7;
        this.f23456b = zyVar;
        this.f23457c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f23455a) {
            case 0:
                zy zyVar = this.f23456b;
                zyVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f23457c.message.f28452id));
                zyVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                zy zyVar2 = this.f23456b;
                zyVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f23457c.message.f28452id));
                zyVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
