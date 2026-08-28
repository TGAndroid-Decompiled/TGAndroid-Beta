package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f21865a;
    public final VoIPService f21866b;
    public final TLRPC.GroupCallParticipant f21867c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i9) {
        this.f21865a = i9;
        this.f21866b = voIPService;
        this.f21867c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f21865a) {
            case 0:
                this.f21866b.lambda$startConferenceGroupCall$37(this.f21867c);
                return;
            default:
                this.f21866b.lambda$startGroupCall$26(this.f21867c);
                return;
        }
    }
}
