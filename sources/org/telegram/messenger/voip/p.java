package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class p implements Runnable {
    public final int f21665a;
    public final TLObject f21666b;
    public final ArrayList f21667c;
    public final ArrayList d;
    public final Runnable e;

    public p(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f21665a = i10;
        this.f21666b = tLObject;
        this.f21667c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21665a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f21666b, this.f21667c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f21666b, this.f21667c, this.d, this.e);
                return;
        }
    }
}
