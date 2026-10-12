package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19411a;
    public final VoIPService f19412b;
    public final ArrayList f19413c;
    public final ArrayList d;
    public final ArrayList f19414e;
    public final String f19415f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19411a = i10;
        this.f19412b = voIPService;
        this.f19413c = arrayList;
        this.d = arrayList2;
        this.f19414e = arrayList3;
        this.f19415f = str;
    }

    @Override
    public final void run() {
        switch (this.f19411a) {
            case 0:
                this.f19412b.lambda$startConferenceGroupCall$47(this.f19413c, this.d, this.f19414e, this.f19415f);
                return;
            default:
                this.f19412b.lambda$startConferenceGroupCall$39(this.f19413c, this.d, this.f19414e, this.f19415f);
                return;
        }
    }
}
