package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f19915a;
    public final TLObject f19916b;
    public final ArrayList f19917c;
    public final ArrayList d;
    public final Runnable e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19915a = i10;
        this.f19916b = tLObject;
        this.f19917c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19915a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19916b, this.f19917c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19916b, this.f19917c, this.d, this.e);
                return;
        }
    }
}
