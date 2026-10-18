package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f19848a;
    public final VoIPService f19849b;
    public final TLRPC.GroupCallParticipant f19850c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19848a = i10;
        this.f19849b = voIPService;
        this.f19850c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19848a) {
            case 0:
                this.f19849b.lambda$startConferenceGroupCall$37(this.f19850c);
                return;
            default:
                this.f19849b.lambda$startGroupCall$26(this.f19850c);
                return;
        }
    }
}
