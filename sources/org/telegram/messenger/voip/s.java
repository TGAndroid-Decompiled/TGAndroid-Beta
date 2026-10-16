package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f18550a;
    public final TLObject f18551b;
    public final ArrayList f18552c;
    public final ArrayList d;
    public final Runnable e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f18550a = i10;
        this.f18551b = tLObject;
        this.f18552c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18550a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f18551b, this.f18552c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f18551b, this.f18552c, this.d, this.e);
                return;
        }
    }
}
