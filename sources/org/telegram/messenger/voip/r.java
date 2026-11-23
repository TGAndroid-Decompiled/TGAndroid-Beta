package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f27532a;
    public final TLObject f27533b;
    public final ArrayList f27534c;
    public final ArrayList d;
    public final Runnable f27535e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f27532a = i7;
        this.f27533b = tLObject;
        this.f27534c = arrayList;
        this.d = arrayList2;
        this.f27535e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f27532a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f27533b, this.f27534c, this.d, this.f27535e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f27533b, this.f27534c, this.d, this.f27535e);
                return;
        }
    }
}
