package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f19910a;
    public final TLObject f19911b;
    public final ArrayList f19912c;
    public final ArrayList d;
    public final Runnable e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19910a = i10;
        this.f19911b = tLObject;
        this.f19912c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19910a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19911b, this.f19912c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19911b, this.f19912c, this.d, this.e);
                return;
        }
    }
}
