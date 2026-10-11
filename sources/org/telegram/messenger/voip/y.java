package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19671a;
    public final VoIPService f19672b;
    public final ArrayList f19673c;
    public final ArrayList d;
    public final ArrayList f19674e;
    public final String f19675f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19671a = i10;
        this.f19672b = voIPService;
        this.f19673c = arrayList;
        this.d = arrayList2;
        this.f19674e = arrayList3;
        this.f19675f = str;
    }

    @Override
    public final void run() {
        switch (this.f19671a) {
            case 0:
                this.f19672b.lambda$startConferenceGroupCall$47(this.f19673c, this.d, this.f19674e, this.f19675f);
                return;
            default:
                this.f19672b.lambda$startConferenceGroupCall$39(this.f19673c, this.d, this.f19674e, this.f19675f);
                return;
        }
    }
}
