package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f19610a;
    public final TLObject f19611b;
    public final ArrayList f19612c;
    public final ArrayList d;
    public final Runnable f19613e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19610a = i10;
        this.f19611b = tLObject;
        this.f19612c = arrayList;
        this.d = arrayList2;
        this.f19613e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19610a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19611b, this.f19612c, this.d, this.f19613e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19611b, this.f19612c, this.d, this.f19613e);
                return;
        }
    }
}
