package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17625a;
    public final VoIPService f17626b;
    public final TLRPC.GroupCallParticipant f17627c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17625a = i10;
        this.f17626b = voIPService;
        this.f17627c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17625a) {
            case 0:
                this.f17626b.lambda$startConferenceGroupCall$37(this.f17627c);
                return;
            default:
                this.f17626b.lambda$startGroupCall$26(this.f17627c);
                return;
        }
    }
}
