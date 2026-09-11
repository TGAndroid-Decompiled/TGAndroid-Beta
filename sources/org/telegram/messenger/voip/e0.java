package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19359a;
    public final VoIPService f19360b;
    public final TLRPC.GroupCallParticipant f19361c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19359a = i10;
        this.f19360b = voIPService;
        this.f19361c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19359a) {
            case 0:
                this.f19360b.lambda$startConferenceGroupCall$37(this.f19361c);
                return;
            default:
                this.f19360b.lambda$startGroupCall$26(this.f19361c);
                return;
        }
    }
}
