package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f27563a;
    public final VoIPService f27564b;
    public final ArrayList f27565c;
    public final ArrayList d;
    public final ArrayList f27566e;
    public final String f27567f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f27563a = i7;
        this.f27564b = voIPService;
        this.f27565c = arrayList;
        this.d = arrayList2;
        this.f27566e = arrayList3;
        this.f27567f = str;
    }

    @Override
    public final void run() {
        switch (this.f27563a) {
            case 0:
                this.f27564b.lambda$startConferenceGroupCall$47(this.f27565c, this.d, this.f27566e, this.f27567f);
                return;
            default:
                this.f27564b.lambda$startConferenceGroupCall$39(this.f27565c, this.d, this.f27566e, this.f27567f);
                return;
        }
    }
}
