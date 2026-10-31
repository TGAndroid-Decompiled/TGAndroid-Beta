package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class uw implements Runnable {
    public final int f18405a;
    public final qz f18406b;
    public final TL_update.TL_updateNewChannelMessage f18407c;
    public final long d;

    public uw(qz qzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f18405a = i10;
        this.f18406b = qzVar;
        this.f18407c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18405a) {
            case 0:
                qz qzVar = this.f18406b;
                qzVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f18407c.message.f19814id));
                qzVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                qz qzVar2 = this.f18406b;
                qzVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f18407c.message.f19814id));
                qzVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
