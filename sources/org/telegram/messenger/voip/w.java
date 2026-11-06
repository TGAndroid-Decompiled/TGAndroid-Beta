package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f26177a;
    public final VoIPService f26178b;
    public final ArrayList f26179c;
    public final ArrayList d;
    public final ArrayList f26180e;
    public final String f26181f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f26177a = i7;
        this.f26178b = voIPService;
        this.f26179c = arrayList;
        this.d = arrayList2;
        this.f26180e = arrayList3;
        this.f26181f = str;
    }

    @Override
    public final void run() {
        switch (this.f26177a) {
            case 0:
                this.f26178b.lambda$startConferenceGroupCall$47(this.f26179c, this.d, this.f26180e, this.f26181f);
                return;
            default:
                this.f26178b.lambda$startConferenceGroupCall$39(this.f26179c, this.d, this.f26180e, this.f26181f);
                return;
        }
    }
}
