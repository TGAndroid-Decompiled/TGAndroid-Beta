package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19450a;
    public final VoIPService f19451b;
    public final ArrayList f19452c;
    public final ArrayList d;
    public final ArrayList f19453e;
    public final String f19454f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19450a = i10;
        this.f19451b = voIPService;
        this.f19452c = arrayList;
        this.d = arrayList2;
        this.f19453e = arrayList3;
        this.f19454f = str;
    }

    @Override
    public final void run() {
        switch (this.f19450a) {
            case 0:
                this.f19451b.lambda$startConferenceGroupCall$47(this.f19452c, this.d, this.f19453e, this.f19454f);
                return;
            default:
                this.f19451b.lambda$startConferenceGroupCall$39(this.f19452c, this.d, this.f19453e, this.f19454f);
                return;
        }
    }
}
