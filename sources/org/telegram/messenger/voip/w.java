package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f19916a;
    public final VoIPService f19917b;
    public final ArrayList f19918c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f19919f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19916a = i10;
        this.f19917b = voIPService;
        this.f19918c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f19919f = str;
    }

    @Override
    public final void run() {
        switch (this.f19916a) {
            case 0:
                this.f19917b.lambda$startConferenceGroupCall$47(this.f19918c, this.d, this.e, this.f19919f);
                return;
            default:
                this.f19917b.lambda$startConferenceGroupCall$39(this.f19918c, this.d, this.e, this.f19919f);
                return;
        }
    }
}
