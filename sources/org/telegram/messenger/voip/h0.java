package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f18653a;
    public final VoIPService f18654b;
    public final TLRPC.GroupCallParticipant f18655c;

    public h0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f18653a = i10;
        this.f18654b = voIPService;
        this.f18655c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f18653a) {
            case 0:
                this.f18654b.lambda$startConferenceGroupCall$37(this.f18655c);
                return;
            default:
                this.f18654b.lambda$startGroupCall$26(this.f18655c);
                return;
        }
    }
}
