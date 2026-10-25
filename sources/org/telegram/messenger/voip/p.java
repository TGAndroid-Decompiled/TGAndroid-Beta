package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class p implements Runnable {
    public final int f21677a;
    public final TLObject f21678b;
    public final ArrayList f21679c;
    public final ArrayList d;
    public final Runnable e;

    public p(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f21677a = i10;
        this.f21678b = tLObject;
        this.f21679c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21677a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f21678b, this.f21679c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f21678b, this.f21679c, this.d, this.e);
                return;
        }
    }
}
