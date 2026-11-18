package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f27541a;
    public final TLObject f27542b;
    public final ArrayList f27543c;
    public final ArrayList d;
    public final Runnable f27544e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f27541a = i7;
        this.f27542b = tLObject;
        this.f27543c = arrayList;
        this.d = arrayList2;
        this.f27544e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f27541a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f27542b, this.f27543c, this.d, this.f27544e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f27542b, this.f27543c, this.d, this.f27544e);
                return;
        }
    }
}
