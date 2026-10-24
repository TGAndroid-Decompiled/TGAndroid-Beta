package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f19978a;
    public final TLObject f19979b;
    public final ArrayList f19980c;
    public final ArrayList d;
    public final Runnable e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19978a = i10;
        this.f19979b = tLObject;
        this.f19980c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19978a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19979b, this.f19980c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19979b, this.f19980c, this.d, this.e);
                return;
        }
    }
}
