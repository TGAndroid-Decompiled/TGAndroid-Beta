package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f18815a;
    public final TLObject f18816b;
    public final ArrayList f18817c;
    public final ArrayList d;
    public final Runnable e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f18815a = i10;
        this.f18816b = tLObject;
        this.f18817c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18815a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f18816b, this.f18817c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f18816b, this.f18817c, this.d, this.e);
                return;
        }
    }
}
