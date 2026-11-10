package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;
public final class iw implements Runnable {
    public final int f23377a;
    public final gz f23378b;
    public final TL_update.TL_updateNewChannelMessage f23379c;
    public final long d;

    public iw(gz gzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.f23377a = i7;
        this.f23378b = gzVar;
        this.f23379c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f23377a) {
            case 0:
                gz gzVar = this.f23378b;
                gzVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.f23379c.message.f26981id));
                gzVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                return;
            default:
                gz gzVar2 = this.f23378b;
                gzVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f23379c.message.f26981id));
                gzVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                return;
        }
    }
}
