package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17967a;
    public final VoIPService f17968b;
    public final ArrayList f17969c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17970f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17967a = i10;
        this.f17968b = voIPService;
        this.f17969c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17970f = str;
    }

    @Override
    public final void run() {
        switch (this.f17967a) {
            case 0:
                this.f17968b.lambda$startConferenceGroupCall$47(this.f17969c, this.d, this.e, this.f17970f);
                return;
            default:
                this.f17968b.lambda$startConferenceGroupCall$39(this.f17969c, this.d, this.e, this.f17970f);
                return;
        }
    }
}
