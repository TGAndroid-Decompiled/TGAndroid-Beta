package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class z implements Runnable {
    public final int f19644a;
    public final VoIPService f19645b;
    public final ArrayList f19646c;
    public final ArrayList d;
    public final ArrayList f19647e;
    public final String f19648f;

    public z(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19644a = i10;
        this.f19645b = voIPService;
        this.f19646c = arrayList;
        this.d = arrayList2;
        this.f19647e = arrayList3;
        this.f19648f = str;
    }

    @Override
    public final void run() {
        switch (this.f19644a) {
            case 0:
                this.f19645b.lambda$startConferenceGroupCall$47(this.f19646c, this.d, this.f19647e, this.f19648f);
                return;
            default:
                this.f19645b.lambda$startConferenceGroupCall$39(this.f19646c, this.d, this.f19647e, this.f19648f);
                return;
        }
    }
}
