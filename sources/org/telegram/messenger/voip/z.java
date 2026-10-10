package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class z implements Runnable {
    public final int f19648a;
    public final VoIPService f19649b;
    public final ArrayList f19650c;
    public final ArrayList d;
    public final ArrayList f19651e;
    public final String f19652f;

    public z(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19648a = i10;
        this.f19649b = voIPService;
        this.f19650c = arrayList;
        this.d = arrayList2;
        this.f19651e = arrayList3;
        this.f19652f = str;
    }

    @Override
    public final void run() {
        switch (this.f19648a) {
            case 0:
                this.f19649b.lambda$startConferenceGroupCall$47(this.f19650c, this.d, this.f19651e, this.f19652f);
                return;
            default:
                this.f19649b.lambda$startConferenceGroupCall$39(this.f19650c, this.d, this.f19651e, this.f19652f);
                return;
        }
    }
}
