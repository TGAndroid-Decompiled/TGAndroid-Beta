package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f19940a;
    public final VoIPService f19941b;
    public final ArrayList f19942c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f19943f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19940a = i10;
        this.f19941b = voIPService;
        this.f19942c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f19943f = str;
    }

    @Override
    public final void run() {
        switch (this.f19940a) {
            case 0:
                this.f19941b.lambda$startConferenceGroupCall$47(this.f19942c, this.d, this.e, this.f19943f);
                return;
            default:
                this.f19941b.lambda$startConferenceGroupCall$39(this.f19942c, this.d, this.e, this.f19943f);
                return;
        }
    }
}
