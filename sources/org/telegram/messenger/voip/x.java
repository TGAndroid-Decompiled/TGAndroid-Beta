package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f27518a;
    public final VoIPService f27519b;
    public final ArrayList f27520c;
    public final ArrayList d;
    public final ArrayList f27521e;
    public final String f27522f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f27518a = i7;
        this.f27519b = voIPService;
        this.f27520c = arrayList;
        this.d = arrayList2;
        this.f27521e = arrayList3;
        this.f27522f = str;
    }

    @Override
    public final void run() {
        switch (this.f27518a) {
            case 0:
                this.f27519b.lambda$startConferenceGroupCall$47(this.f27520c, this.d, this.f27521e, this.f27522f);
                return;
            default:
                this.f27519b.lambda$startConferenceGroupCall$39(this.f27520c, this.d, this.f27521e, this.f27522f);
                return;
        }
    }
}
