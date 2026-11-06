package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f26147a;
    public final TLObject f26148b;
    public final ArrayList f26149c;
    public final ArrayList d;
    public final Runnable f26150e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f26147a = i7;
        this.f26148b = tLObject;
        this.f26149c = arrayList;
        this.d = arrayList2;
        this.f26150e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f26147a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f26148b, this.f26149c, this.d, this.f26150e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f26148b, this.f26149c, this.d, this.f26150e);
                return;
        }
    }
}
