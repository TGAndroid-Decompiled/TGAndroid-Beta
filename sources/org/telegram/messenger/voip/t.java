package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class t implements Runnable {
    public final int f19620a;
    public final TLObject f19621b;
    public final ArrayList f19622c;
    public final ArrayList d;
    public final Runnable f19623e;

    public t(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19620a = i10;
        this.f19621b = tLObject;
        this.f19622c = arrayList;
        this.d = arrayList2;
        this.f19623e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19620a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19621b, this.f19622c, this.d, this.f19623e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19621b, this.f19622c, this.d, this.f19623e);
                return;
        }
    }
}
