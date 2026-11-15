package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f27197a;
    public final VoIPService f27198b;
    public final ArrayList f27199c;
    public final ArrayList d;
    public final ArrayList f27200e;
    public final String f27201f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f27197a = i7;
        this.f27198b = voIPService;
        this.f27199c = arrayList;
        this.d = arrayList2;
        this.f27200e = arrayList3;
        this.f27201f = str;
    }

    @Override
    public final void run() {
        switch (this.f27197a) {
            case 0:
                this.f27198b.lambda$startConferenceGroupCall$47(this.f27199c, this.d, this.f27200e, this.f27201f);
                return;
            default:
                this.f27198b.lambda$startConferenceGroupCall$39(this.f27199c, this.d, this.f27200e, this.f27201f);
                return;
        }
    }
}
