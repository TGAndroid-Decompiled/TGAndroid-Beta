package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f27174a;
    public final TLObject f27175b;
    public final ArrayList f27176c;
    public final ArrayList d;
    public final Runnable f27177e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f27174a = i7;
        this.f27175b = tLObject;
        this.f27176c = arrayList;
        this.d = arrayList2;
        this.f27177e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f27174a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f27175b, this.f27176c, this.d, this.f27177e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f27175b, this.f27176c, this.d, this.f27177e);
                return;
        }
    }
}
