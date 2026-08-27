package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

public final class c0 implements Runnable {

    public final int f21889a;

    public final VoIPService f21890b;

    public final TLRPC.GroupCallParticipant f21891c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f21889a = i10;
        this.f21890b = voIPService;
        this.f21891c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f21889a) {
            case 0:
                this.f21890b.lambda$startConferenceGroupCall$37(this.f21891c);
                break;
            default:
                this.f21890b.lambda$startGroupCall$26(this.f21891c);
                break;
        }
    }
}
