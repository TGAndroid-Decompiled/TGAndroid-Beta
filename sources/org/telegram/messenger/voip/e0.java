package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19542a;
    public final VoIPService f19543b;
    public final TLRPC.GroupCallParticipant f19544c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19542a = i10;
        this.f19543b = voIPService;
        this.f19544c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19542a) {
            case 0:
                this.f19543b.lambda$startConferenceGroupCall$37(this.f19544c);
                return;
            default:
                this.f19543b.lambda$startGroupCall$26(this.f19544c);
                return;
        }
    }
}
