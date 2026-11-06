package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class jw implements Runnable {
    public final int f23603a;
    public final gz f23604b;
    public final TL_update.TL_updateNewChannelMessage f23605c;
    public final long d;

    public jw(gz gzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.f23603a = i7;
        this.f23604b = gzVar;
        this.f23605c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f23603a) {
            case 0:
                gz gzVar = this.f23604b;
                gzVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f23605c.message.f26974id));
                gzVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                gz gzVar2 = this.f23604b;
                gzVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f23605c.message.f26974id));
                gzVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
