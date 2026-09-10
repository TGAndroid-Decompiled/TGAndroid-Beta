package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class u implements Runnable {
    public final int f16788a;
    public final TLObject f16789b;
    public final ArrayList f16790c;
    public final ArrayList d;
    public final Runnable e;

    public u(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f16788a = i10;
        this.f16789b = tLObject;
        this.f16790c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16788a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f16789b, this.f16790c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f16789b, this.f16790c, this.d, this.e);
                return;
        }
    }
}
