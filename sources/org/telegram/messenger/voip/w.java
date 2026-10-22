package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f19937a;
    public final VoIPService f19938b;
    public final ArrayList f19939c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f19940f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19937a = i10;
        this.f19938b = voIPService;
        this.f19939c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f19940f = str;
    }

    @Override
    public final void run() {
        switch (this.f19937a) {
            case 0:
                this.f19938b.lambda$startConferenceGroupCall$47(this.f19939c, this.d, this.e, this.f19940f);
                return;
            default:
                this.f19938b.lambda$startConferenceGroupCall$39(this.f19939c, this.d, this.e, this.f19940f);
                return;
        }
    }
}
