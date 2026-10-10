package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class t implements Runnable {
    public final int f19624a;
    public final TLObject f19625b;
    public final ArrayList f19626c;
    public final ArrayList d;
    public final Runnable f19627e;

    public t(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19624a = i10;
        this.f19625b = tLObject;
        this.f19626c = arrayList;
        this.d = arrayList2;
        this.f19627e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19624a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19625b, this.f19626c, this.d, this.f19627e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19625b, this.f19626c, this.d, this.f19627e);
                return;
        }
    }
}
