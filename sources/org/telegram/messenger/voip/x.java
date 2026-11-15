package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f27196a;
    public final VoIPService f27197b;
    public final ArrayList f27198c;
    public final ArrayList d;
    public final ArrayList f27199e;
    public final String f27200f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f27196a = i7;
        this.f27197b = voIPService;
        this.f27198c = arrayList;
        this.d = arrayList2;
        this.f27199e = arrayList3;
        this.f27200f = str;
    }

    @Override
    public final void run() {
        switch (this.f27196a) {
            case 0:
                this.f27197b.lambda$startConferenceGroupCall$47(this.f27198c, this.d, this.f27199e, this.f27200f);
                return;
            default:
                this.f27197b.lambda$startConferenceGroupCall$39(this.f27198c, this.d, this.f27199e, this.f27200f);
                return;
        }
    }
}
