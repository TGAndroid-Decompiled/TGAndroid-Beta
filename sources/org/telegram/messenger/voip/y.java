package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19632a;
    public final VoIPService f19633b;
    public final ArrayList f19634c;
    public final ArrayList d;
    public final ArrayList f19635e;
    public final String f19636f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19632a = i10;
        this.f19633b = voIPService;
        this.f19634c = arrayList;
        this.d = arrayList2;
        this.f19635e = arrayList3;
        this.f19636f = str;
    }

    @Override
    public final void run() {
        switch (this.f19632a) {
            case 0:
                this.f19633b.lambda$startConferenceGroupCall$47(this.f19634c, this.d, this.f19635e, this.f19636f);
                return;
            default:
                this.f19633b.lambda$startConferenceGroupCall$39(this.f19634c, this.d, this.f19635e, this.f19636f);
                return;
        }
    }
}
