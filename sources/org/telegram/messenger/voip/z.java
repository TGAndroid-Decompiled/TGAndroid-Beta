package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class z implements Runnable {
    public final int f18889a;
    public final VoIPService f18890b;
    public final ArrayList f18891c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f18892f;

    public z(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f18889a = i10;
        this.f18890b = voIPService;
        this.f18891c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f18892f = str;
    }

    @Override
    public final void run() {
        switch (this.f18889a) {
            case 0:
                this.f18890b.lambda$startConferenceGroupCall$47(this.f18891c, this.d, this.e, this.f18892f);
                return;
            default:
                this.f18890b.lambda$startConferenceGroupCall$39(this.f18891c, this.d, this.e, this.f18892f);
                return;
        }
    }
}
