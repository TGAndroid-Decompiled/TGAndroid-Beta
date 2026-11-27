package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class slc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final TLRPC.Updates c;
    public final long d;

    public slc(VoIPService voIPService, TLRPC.Updates updates, long j, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = updates;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.Updates updates = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startConferenceGroupCall$49(updates, j);
                return;
            default:
                voIPService.lambda$startConferenceGroupCall$41(updates, j);
                return;
        }
    }
}
