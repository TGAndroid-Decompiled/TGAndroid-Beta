package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class bw implements Runnable {
    public final int f21898a;
    public final yy f21899b;
    public final TL_update.TL_updateNewChannelMessage f21900c;
    public final long d;

    public bw(yy yyVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i3) {
        this.f21898a = i3;
        this.f21899b = yyVar;
        this.f21900c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21898a) {
            case 0:
                yy yyVar = this.f21899b;
                yyVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f21900c.message.f27022id));
                yyVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                yy yyVar2 = this.f21899b;
                yyVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f21900c.message.f27022id));
                yyVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
