package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f20467a;
    public final TLObject f20468b;
    public final ArrayList f20469c;
    public final ArrayList d;
    public final Runnable f20470e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f20467a = i10;
        this.f20468b = tLObject;
        this.f20469c = arrayList;
        this.d = arrayList2;
        this.f20470e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20467a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f20468b, this.f20469c, this.d, this.f20470e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f20468b, this.f20469c, this.d, this.f20470e);
                return;
        }
    }
}
