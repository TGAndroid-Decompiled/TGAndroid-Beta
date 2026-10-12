package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19322a;
    public final VoIPService f19323b;
    public final TLRPC.GroupCallParticipant f19324c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19322a = i10;
        this.f19323b = voIPService;
        this.f19324c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19322a) {
            case 0:
                this.f19323b.lambda$startConferenceGroupCall$37(this.f19324c);
                return;
            default:
                this.f19323b.lambda$startGroupCall$26(this.f19324c);
                return;
        }
    }
}
