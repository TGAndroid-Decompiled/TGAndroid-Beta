package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class cw implements Runnable {
    public final int f23430a;
    public final zy f23431b;
    public final TL_update.TL_updateNewChannelMessage f23432c;
    public final long d;

    public cw(zy zyVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.f23430a = i7;
        this.f23431b = zyVar;
        this.f23432c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f23430a) {
            case 0:
                zy zyVar = this.f23431b;
                zyVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f23432c.message.f28426id));
                zyVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                zy zyVar2 = this.f23431b;
                zyVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f23432c.message.f28426id));
                zyVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
