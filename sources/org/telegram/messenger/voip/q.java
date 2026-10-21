package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f19894a;
    public final TLObject f19895b;
    public final ArrayList f19896c;
    public final ArrayList d;
    public final Runnable e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19894a = i10;
        this.f19895b = tLObject;
        this.f19896c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19894a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19895b, this.f19896c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19895b, this.f19896c, this.d, this.e);
                return;
        }
    }
}
