package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class jlc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final TLRPC.GroupCallParticipant c;

    public jlc(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = groupCallParticipant;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.GroupCallParticipant groupCallParticipant = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startGroupCall$29(groupCallParticipant);
                return;
            default:
                voIPService.lambda$startConferenceGroupCall$40(groupCallParticipant);
                return;
        }
    }
}
