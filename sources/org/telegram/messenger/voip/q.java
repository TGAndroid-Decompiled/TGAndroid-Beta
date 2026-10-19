package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f19900a;
    public final TLObject f19901b;
    public final ArrayList f19902c;
    public final ArrayList d;
    public final Runnable e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19900a = i10;
        this.f19901b = tLObject;
        this.f19902c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19900a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19901b, this.f19902c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19901b, this.f19902c, this.d, this.e);
                return;
        }
    }
}
