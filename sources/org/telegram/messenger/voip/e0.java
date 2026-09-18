package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17650a;
    public final VoIPService f17651b;
    public final TLRPC.GroupCallParticipant f17652c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17650a = i10;
        this.f17651b = voIPService;
        this.f17652c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17650a) {
            case 0:
                this.f17651b.lambda$startConferenceGroupCall$37(this.f17652c);
                return;
            default:
                this.f17651b.lambda$startGroupCall$26(this.f17652c);
                return;
        }
    }
}
