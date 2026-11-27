package defpackage;

import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
public final class ulc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final HashSet c;
    public final String d;

    public ulc(VoIPService voIPService, HashSet hashSet, String str, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        HashSet hashSet = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startConferenceGroupCall$53(hashSet, str);
                return;
            default:
                voIPService.lambda$startConferenceGroupCall$45(hashSet, str);
                return;
        }
    }
}
