package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f21682a;
    public final VoIPService f21683b;
    public final TLRPC.Updates f21684c;
    public final long d;

    public t(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f21682a = i10;
        this.f21683b = voIPService;
        this.f21684c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21682a) {
            case 0:
                this.f21683b.lambda$startConferenceGroupCall$38(this.f21684c, this.d);
                return;
            default:
                this.f21683b.lambda$startConferenceGroupCall$46(this.f21684c, this.d);
                return;
        }
    }
}
