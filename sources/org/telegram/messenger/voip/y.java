package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17977a;
    public final VoIPService f17978b;
    public final ArrayList f17979c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17980f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17977a = i10;
        this.f17978b = voIPService;
        this.f17979c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17980f = str;
    }

    @Override
    public final void run() {
        switch (this.f17977a) {
            case 0:
                this.f17978b.lambda$startConferenceGroupCall$47(this.f17979c, this.d, this.e, this.f17980f);
                return;
            default:
                this.f17978b.lambda$startConferenceGroupCall$39(this.f17979c, this.d, this.e, this.f17980f);
                return;
        }
    }
}
