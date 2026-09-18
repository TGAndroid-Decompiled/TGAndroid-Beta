package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17910a;
    public final VoIPService f17911b;
    public final ArrayList f17912c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17913f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17910a = i10;
        this.f17911b = voIPService;
        this.f17912c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17913f = str;
    }

    @Override
    public final void run() {
        switch (this.f17910a) {
            case 0:
                this.f17911b.lambda$startConferenceGroupCall$47(this.f17912c, this.d, this.e, this.f17913f);
                return;
            default:
                this.f17911b.lambda$startConferenceGroupCall$39(this.f17912c, this.d, this.e, this.f17913f);
                return;
        }
    }
}
