package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19627a;
    public final VoIPService f19628b;
    public final ArrayList f19629c;
    public final ArrayList d;
    public final ArrayList f19630e;
    public final String f19631f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19627a = i10;
        this.f19628b = voIPService;
        this.f19629c = arrayList;
        this.d = arrayList2;
        this.f19630e = arrayList3;
        this.f19631f = str;
    }

    @Override
    public final void run() {
        switch (this.f19627a) {
            case 0:
                this.f19628b.lambda$startConferenceGroupCall$47(this.f19629c, this.d, this.f19630e, this.f19631f);
                return;
            default:
                this.f19628b.lambda$startConferenceGroupCall$39(this.f19629c, this.d, this.f19630e, this.f19631f);
                return;
        }
    }
}
