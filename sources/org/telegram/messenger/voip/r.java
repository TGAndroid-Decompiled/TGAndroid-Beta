package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f22002a;
    public final TLObject f22003b;
    public final ArrayList f22004c;
    public final ArrayList d;
    public final Runnable f22005e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f22002a = i10;
        this.f22003b = tLObject;
        this.f22004c = arrayList;
        this.d = arrayList2;
        this.f22005e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f22002a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f22003b, this.f22004c, this.d, this.f22005e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f22003b, this.f22004c, this.d, this.f22005e);
                return;
        }
    }
}
