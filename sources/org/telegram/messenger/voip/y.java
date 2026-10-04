package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19635a;
    public final VoIPService f19636b;
    public final ArrayList f19637c;
    public final ArrayList d;
    public final ArrayList f19638e;
    public final String f19639f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19635a = i10;
        this.f19636b = voIPService;
        this.f19637c = arrayList;
        this.d = arrayList2;
        this.f19638e = arrayList3;
        this.f19639f = str;
    }

    @Override
    public final void run() {
        switch (this.f19635a) {
            case 0:
                this.f19636b.lambda$startConferenceGroupCall$47(this.f19637c, this.d, this.f19638e, this.f19639f);
                return;
            default:
                this.f19636b.lambda$startConferenceGroupCall$39(this.f19637c, this.d, this.f19638e, this.f19639f);
                return;
        }
    }
}
