package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class v implements Runnable {
    public final int f21700a;
    public final VoIPService f21701b;
    public final ArrayList f21702c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f21703f;

    public v(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f21700a = i10;
        this.f21701b = voIPService;
        this.f21702c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f21703f = str;
    }

    @Override
    public final void run() {
        switch (this.f21700a) {
            case 0:
                this.f21701b.lambda$startConferenceGroupCall$47(this.f21702c, this.d, this.e, this.f21703f);
                return;
            default:
                this.f21701b.lambda$startConferenceGroupCall$39(this.f21702c, this.d, this.e, this.f21703f);
                return;
        }
    }
}
