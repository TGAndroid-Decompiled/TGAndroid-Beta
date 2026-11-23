package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f27659a;
    public final VoIPService f27660b;
    public final ArrayList f27661c;
    public final ArrayList d;
    public final ArrayList f27662e;
    public final String f27663f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f27659a = i7;
        this.f27660b = voIPService;
        this.f27661c = arrayList;
        this.d = arrayList2;
        this.f27662e = arrayList3;
        this.f27663f = str;
    }

    @Override
    public final void run() {
        switch (this.f27659a) {
            case 0:
                this.f27660b.lambda$startConferenceGroupCall$47(this.f27661c, this.d, this.f27662e, this.f27663f);
                return;
            default:
                this.f27660b.lambda$startConferenceGroupCall$39(this.f27661c, this.d, this.f27662e, this.f27663f);
                return;
        }
    }
}
