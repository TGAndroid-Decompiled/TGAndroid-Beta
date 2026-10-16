package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f18573a;
    public final VoIPService f18574b;
    public final ArrayList f18575c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f18576f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f18573a = i10;
        this.f18574b = voIPService;
        this.f18575c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f18576f = str;
    }

    @Override
    public final void run() {
        switch (this.f18573a) {
            case 0:
                this.f18574b.lambda$startConferenceGroupCall$47(this.f18575c, this.d, this.e, this.f18576f);
                return;
            default:
                this.f18574b.lambda$startConferenceGroupCall$39(this.f18575c, this.d, this.e, this.f18576f);
                return;
        }
    }
}
