package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

public final class q implements Runnable {

    public final int f21957a;

    public final TLObject f21958b;

    public final ArrayList f21959c;
    public final ArrayList d;

    public final Runnable f21960e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f21957a = i10;
        this.f21958b = tLObject;
        this.f21959c = arrayList;
        this.d = arrayList2;
        this.f21960e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21957a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f21958b, this.f21959c, this.d, this.f21960e);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f21958b, this.f21959c, this.d, this.f21960e);
                break;
        }
    }
}
