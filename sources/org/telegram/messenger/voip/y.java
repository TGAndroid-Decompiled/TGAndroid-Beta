package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17708a;
    public final VoIPService f17709b;
    public final ArrayList f17710c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17711f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17708a = i10;
        this.f17709b = voIPService;
        this.f17710c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17711f = str;
    }

    @Override
    public final void run() {
        switch (this.f17708a) {
            case 0:
                this.f17709b.lambda$startConferenceGroupCall$47(this.f17710c, this.d, this.e, this.f17711f);
                return;
            default:
                this.f17709b.lambda$startConferenceGroupCall$39(this.f17710c, this.d, this.e, this.f17711f);
                return;
        }
    }
}
