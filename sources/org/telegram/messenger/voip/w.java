package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f19919a;
    public final VoIPService f19920b;
    public final ArrayList f19921c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f19922f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19919a = i10;
        this.f19920b = voIPService;
        this.f19921c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f19922f = str;
    }

    @Override
    public final void run() {
        switch (this.f19919a) {
            case 0:
                this.f19920b.lambda$startConferenceGroupCall$47(this.f19921c, this.d, this.e, this.f19922f);
                return;
            default:
                this.f19920b.lambda$startConferenceGroupCall$39(this.f19921c, this.d, this.e, this.f19922f);
                return;
        }
    }
}
