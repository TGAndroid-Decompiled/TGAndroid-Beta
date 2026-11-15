package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class gw implements Runnable {
    public final int f23920a;
    public final ez f23921b;
    public final TL_update.TL_updateNewChannelMessage f23922c;
    public final long d;

    public gw(ez ezVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.f23920a = i7;
        this.f23921b = ezVar;
        this.f23922c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f23920a) {
            case 0:
                ez ezVar = this.f23921b;
                ezVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f23922c.message.f28072id));
                ezVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                ez ezVar2 = this.f23921b;
                ezVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f23922c.message.f28072id));
                ezVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
