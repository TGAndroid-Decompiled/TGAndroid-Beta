package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f19921a;
    public final VoIPService f19922b;
    public final ArrayList f19923c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f19924f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19921a = i10;
        this.f19922b = voIPService;
        this.f19923c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f19924f = str;
    }

    @Override
    public final void run() {
        switch (this.f19921a) {
            case 0:
                this.f19922b.lambda$startConferenceGroupCall$47(this.f19923c, this.d, this.e, this.f19924f);
                return;
            default:
                this.f19922b.lambda$startConferenceGroupCall$39(this.f19923c, this.d, this.e, this.f19924f);
                return;
        }
    }
}
