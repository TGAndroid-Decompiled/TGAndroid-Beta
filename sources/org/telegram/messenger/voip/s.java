package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f19441a;
    public final TLObject f19442b;
    public final ArrayList f19443c;
    public final ArrayList d;
    public final Runnable f19444e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19441a = i10;
        this.f19442b = tLObject;
        this.f19443c = arrayList;
        this.d = arrayList2;
        this.f19444e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19441a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19442b, this.f19443c, this.d, this.f19444e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19442b, this.f19443c, this.d, this.f19444e);
                return;
        }
    }
}
