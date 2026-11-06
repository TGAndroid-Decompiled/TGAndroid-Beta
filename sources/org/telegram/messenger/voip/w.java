package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f26169a;
    public final VoIPService f26170b;
    public final ArrayList f26171c;
    public final ArrayList d;
    public final ArrayList f26172e;
    public final String f26173f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f26169a = i7;
        this.f26170b = voIPService;
        this.f26171c = arrayList;
        this.d = arrayList2;
        this.f26172e = arrayList3;
        this.f26173f = str;
    }

    @Override
    public final void run() {
        switch (this.f26169a) {
            case 0:
                this.f26170b.lambda$startConferenceGroupCall$47(this.f26171c, this.d, this.f26172e, this.f26173f);
                return;
            default:
                this.f26170b.lambda$startConferenceGroupCall$39(this.f26171c, this.d, this.f26172e, this.f26173f);
                return;
        }
    }
}
