package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f19455a;
    public final TLObject f19456b;
    public final ArrayList f19457c;
    public final ArrayList d;
    public final Runnable f19458e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19455a = i10;
        this.f19456b = tLObject;
        this.f19457c = arrayList;
        this.d = arrayList2;
        this.f19458e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19455a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19456b, this.f19457c, this.d, this.f19458e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19456b, this.f19457c, this.d, this.f19458e);
                return;
        }
    }
}
