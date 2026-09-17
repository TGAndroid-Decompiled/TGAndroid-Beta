package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19444a;
    public final VoIPService f19445b;
    public final TLRPC.Updates f19446c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19444a = i10;
        this.f19445b = voIPService;
        this.f19446c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19444a) {
            case 0:
                this.f19445b.lambda$startConferenceGroupCall$38(this.f19446c, this.d);
                return;
            default:
                this.f19445b.lambda$startConferenceGroupCall$46(this.f19446c, this.d);
                return;
        }
    }
}
