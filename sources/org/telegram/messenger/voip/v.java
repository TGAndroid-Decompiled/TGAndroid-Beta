package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f26180a;
    public final VoIPService f26181b;
    public final HashSet f26182c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f26180a = i7;
        this.f26181b = voIPService;
        this.f26182c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f26180a) {
            case 0:
                this.f26181b.lambda$startConferenceGroupCall$42(this.f26182c, this.d);
                return;
            default:
                this.f26181b.lambda$startConferenceGroupCall$50(this.f26182c, this.d);
                return;
        }
    }
}
