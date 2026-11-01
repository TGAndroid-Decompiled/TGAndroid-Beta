package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class t implements Runnable {
    public final int f18863a;
    public final TLObject f18864b;
    public final ArrayList f18865c;
    public final ArrayList d;
    public final Runnable e;

    public t(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f18863a = i10;
        this.f18864b = tLObject;
        this.f18865c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18863a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f18864b, this.f18865c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f18864b, this.f18865c, this.d, this.e);
                return;
        }
    }
}
