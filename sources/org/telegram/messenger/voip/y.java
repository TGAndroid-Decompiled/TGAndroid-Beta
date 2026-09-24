package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17952a;
    public final VoIPService f17953b;
    public final ArrayList f17954c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17955f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17952a = i10;
        this.f17953b = voIPService;
        this.f17954c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17955f = str;
    }

    @Override
    public final void run() {
        switch (this.f17952a) {
            case 0:
                this.f17953b.lambda$startConferenceGroupCall$47(this.f17954c, this.d, this.e, this.f17955f);
                return;
            default:
                this.f17953b.lambda$startConferenceGroupCall$39(this.f17954c, this.d, this.e, this.f17955f);
                return;
        }
    }
}
