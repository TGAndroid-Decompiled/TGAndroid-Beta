package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17978a;
    public final VoIPService f17979b;
    public final ArrayList f17980c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17981f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17978a = i10;
        this.f17979b = voIPService;
        this.f17980c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17981f = str;
    }

    @Override
    public final void run() {
        switch (this.f17978a) {
            case 0:
                this.f17979b.lambda$startConferenceGroupCall$47(this.f17980c, this.d, this.e, this.f17981f);
                return;
            default:
                this.f17979b.lambda$startConferenceGroupCall$39(this.f17980c, this.d, this.e, this.f17981f);
                return;
        }
    }
}
