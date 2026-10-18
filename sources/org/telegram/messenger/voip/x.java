package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f19932a;
    public final VoIPService f19933b;
    public final ArrayList f19934c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f19935f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19932a = i10;
        this.f19933b = voIPService;
        this.f19934c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f19935f = str;
    }

    @Override
    public final void run() {
        switch (this.f19932a) {
            case 0:
                this.f19933b.lambda$startConferenceGroupCall$47(this.f19934c, this.d, this.e, this.f19935f);
                return;
            default:
                this.f19933b.lambda$startConferenceGroupCall$39(this.f19934c, this.d, this.e, this.f19935f);
                return;
        }
    }
}
