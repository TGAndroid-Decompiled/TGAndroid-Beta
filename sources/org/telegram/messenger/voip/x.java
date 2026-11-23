package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f27554a;
    public final VoIPService f27555b;
    public final ArrayList f27556c;
    public final ArrayList d;
    public final ArrayList f27557e;
    public final String f27558f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f27554a = i7;
        this.f27555b = voIPService;
        this.f27556c = arrayList;
        this.d = arrayList2;
        this.f27557e = arrayList3;
        this.f27558f = str;
    }

    @Override
    public final void run() {
        switch (this.f27554a) {
            case 0:
                this.f27555b.lambda$startConferenceGroupCall$47(this.f27556c, this.d, this.f27557e, this.f27558f);
                return;
            default:
                this.f27555b.lambda$startConferenceGroupCall$39(this.f27556c, this.d, this.f27557e, this.f27558f);
                return;
        }
    }
}
