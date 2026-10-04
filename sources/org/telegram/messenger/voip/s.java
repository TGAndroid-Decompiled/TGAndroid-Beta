package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f19611a;
    public final TLObject f19612b;
    public final ArrayList f19613c;
    public final ArrayList d;
    public final Runnable f19614e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19611a = i10;
        this.f19612b = tLObject;
        this.f19613c = arrayList;
        this.d = arrayList2;
        this.f19614e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19611a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19612b, this.f19613c, this.d, this.f19614e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19612b, this.f19613c, this.d, this.f19614e);
                return;
        }
    }
}
