package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f27569a;
    public final TLObject f27570b;
    public final ArrayList f27571c;
    public final ArrayList d;
    public final Runnable f27572e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f27569a = i7;
        this.f27570b = tLObject;
        this.f27571c = arrayList;
        this.d = arrayList2;
        this.f27572e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f27569a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f27570b, this.f27571c, this.d, this.f27572e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f27570b, this.f27571c, this.d, this.f27572e);
                return;
        }
    }
}
