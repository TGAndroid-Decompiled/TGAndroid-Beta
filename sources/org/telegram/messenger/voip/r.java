package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f27637a;
    public final TLObject f27638b;
    public final ArrayList f27639c;
    public final ArrayList d;
    public final Runnable f27640e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f27637a = i7;
        this.f27638b = tLObject;
        this.f27639c = arrayList;
        this.d = arrayList2;
        this.f27640e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f27637a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f27638b, this.f27639c, this.d, this.f27640e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f27638b, this.f27639c, this.d, this.f27640e);
                return;
        }
    }
}
