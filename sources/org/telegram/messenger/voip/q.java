package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f21933a;
    public final TLObject f21934b;
    public final ArrayList f21935c;
    public final ArrayList d;
    public final Runnable f21936e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i9) {
        this.f21933a = i9;
        this.f21934b = tLObject;
        this.f21935c = arrayList;
        this.d = arrayList2;
        this.f21936e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21933a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f21934b, this.f21935c, this.d, this.f21936e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f21934b, this.f21935c, this.d, this.f21936e);
                return;
        }
    }
}
