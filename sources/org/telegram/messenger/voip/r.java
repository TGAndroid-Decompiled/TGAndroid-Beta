package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f19899a;
    public final TLObject f19900b;
    public final ArrayList f19901c;
    public final ArrayList d;
    public final Runnable e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19899a = i10;
        this.f19900b = tLObject;
        this.f19901c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19899a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19900b, this.f19901c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19900b, this.f19901c, this.d, this.e);
                return;
        }
    }
}
