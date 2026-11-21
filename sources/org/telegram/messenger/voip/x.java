package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f27591a;
    public final VoIPService f27592b;
    public final ArrayList f27593c;
    public final ArrayList d;
    public final ArrayList f27594e;
    public final String f27595f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f27591a = i7;
        this.f27592b = voIPService;
        this.f27593c = arrayList;
        this.d = arrayList2;
        this.f27594e = arrayList3;
        this.f27595f = str;
    }

    @Override
    public final void run() {
        switch (this.f27591a) {
            case 0:
                this.f27592b.lambda$startConferenceGroupCall$47(this.f27593c, this.d, this.f27594e, this.f27595f);
                return;
            default:
                this.f27592b.lambda$startConferenceGroupCall$39(this.f27593c, this.d, this.f27594e, this.f27595f);
                return;
        }
    }
}
