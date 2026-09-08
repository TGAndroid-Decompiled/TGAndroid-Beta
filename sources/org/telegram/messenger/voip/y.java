package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19463a;
    public final VoIPService f19464b;
    public final ArrayList f19465c;
    public final ArrayList d;
    public final ArrayList f19466e;
    public final String f19467f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19463a = i10;
        this.f19464b = voIPService;
        this.f19465c = arrayList;
        this.d = arrayList2;
        this.f19466e = arrayList3;
        this.f19467f = str;
    }

    @Override
    public final void run() {
        switch (this.f19463a) {
            case 0:
                this.f19464b.lambda$startConferenceGroupCall$47(this.f19465c, this.d, this.f19466e, this.f19467f);
                return;
            default:
                this.f19464b.lambda$startConferenceGroupCall$39(this.f19465c, this.d, this.f19466e, this.f19467f);
                return;
        }
    }
}
