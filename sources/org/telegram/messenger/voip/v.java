package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class v implements Runnable {
    public final int f21688a;
    public final VoIPService f21689b;
    public final ArrayList f21690c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f21691f;

    public v(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f21688a = i10;
        this.f21689b = voIPService;
        this.f21690c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f21691f = str;
    }

    @Override
    public final void run() {
        switch (this.f21688a) {
            case 0:
                this.f21689b.lambda$startConferenceGroupCall$47(this.f21690c, this.d, this.e, this.f21691f);
                return;
            default:
                this.f21689b.lambda$startConferenceGroupCall$39(this.f21690c, this.d, this.e, this.f21691f);
                return;
        }
    }
}
