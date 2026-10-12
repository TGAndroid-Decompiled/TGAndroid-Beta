package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class t implements Runnable {
    public final int f18857a;
    public final TLObject f18858b;
    public final ArrayList f18859c;
    public final ArrayList d;
    public final Runnable e;

    public t(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f18857a = i10;
        this.f18858b = tLObject;
        this.f18859c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18857a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f18858b, this.f18859c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f18858b, this.f18859c, this.d, this.e);
                return;
        }
    }
}
