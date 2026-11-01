package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class vw implements Runnable {
    public final int f18913a;
    public final rz f18914b;
    public final TL_update.TL_updateNewChannelMessage f18915c;
    public final long d;

    public vw(rz rzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f18913a = i10;
        this.f18914b = rzVar;
        this.f18915c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18913a) {
            case 0:
                rz rzVar = this.f18914b;
                rzVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f18915c.message.f19815id));
                rzVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                rz rzVar2 = this.f18914b;
                rzVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f18915c.message.f19815id));
                rzVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
