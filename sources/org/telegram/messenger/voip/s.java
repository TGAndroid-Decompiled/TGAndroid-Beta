package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f19414a;
    public final TLObject f19415b;
    public final ArrayList f19416c;
    public final ArrayList d;
    public final Runnable f19417e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19414a = i10;
        this.f19415b = tLObject;
        this.f19416c = arrayList;
        this.d = arrayList2;
        this.f19417e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19414a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19415b, this.f19416c, this.d, this.f19417e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19415b, this.f19416c, this.d, this.f19417e);
                return;
        }
    }
}
