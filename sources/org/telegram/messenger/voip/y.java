package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17724a;
    public final VoIPService f17725b;
    public final ArrayList f17726c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17727f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17724a = i10;
        this.f17725b = voIPService;
        this.f17726c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17727f = str;
    }

    @Override
    public final void run() {
        switch (this.f17724a) {
            case 0:
                this.f17725b.lambda$startConferenceGroupCall$47(this.f17726c, this.d, this.e, this.f17727f);
                return;
            default:
                this.f17725b.lambda$startConferenceGroupCall$39(this.f17726c, this.d, this.e, this.f17727f);
                return;
        }
    }
}
