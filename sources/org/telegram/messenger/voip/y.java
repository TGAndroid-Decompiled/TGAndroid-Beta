package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19634a;
    public final VoIPService f19635b;
    public final ArrayList f19636c;
    public final ArrayList d;
    public final ArrayList f19637e;
    public final String f19638f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19634a = i10;
        this.f19635b = voIPService;
        this.f19636c = arrayList;
        this.d = arrayList2;
        this.f19637e = arrayList3;
        this.f19638f = str;
    }

    @Override
    public final void run() {
        switch (this.f19634a) {
            case 0:
                this.f19635b.lambda$startConferenceGroupCall$47(this.f19636c, this.d, this.f19637e, this.f19638f);
                return;
            default:
                this.f19635b.lambda$startConferenceGroupCall$39(this.f19636c, this.d, this.f19637e, this.f19638f);
                return;
        }
    }
}
