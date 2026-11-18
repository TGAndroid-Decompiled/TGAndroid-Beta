package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f27565a;
    public final VoIPService f27566b;
    public final ArrayList f27567c;
    public final ArrayList d;
    public final ArrayList f27568e;
    public final String f27569f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f27565a = i7;
        this.f27566b = voIPService;
        this.f27567c = arrayList;
        this.d = arrayList2;
        this.f27568e = arrayList3;
        this.f27569f = str;
    }

    @Override
    public final void run() {
        switch (this.f27565a) {
            case 0:
                this.f27566b.lambda$startConferenceGroupCall$47(this.f27567c, this.d, this.f27568e, this.f27569f);
                return;
            default:
                this.f27566b.lambda$startConferenceGroupCall$39(this.f27567c, this.d, this.f27568e, this.f27569f);
                return;
        }
    }
}
