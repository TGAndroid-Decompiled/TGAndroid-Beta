package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f27543a;
    public final TLObject f27544b;
    public final ArrayList f27545c;
    public final ArrayList d;
    public final Runnable f27546e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f27543a = i7;
        this.f27544b = tLObject;
        this.f27545c = arrayList;
        this.d = arrayList2;
        this.f27546e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f27543a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f27544b, this.f27545c, this.d, this.f27546e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f27544b, this.f27545c, this.d, this.f27546e);
                return;
        }
    }
}
