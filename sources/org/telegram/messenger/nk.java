package org.telegram.messenger;

import java.util.ArrayList;

public final class nk implements Runnable {

    public final int f21103a;

    public final TopicsController f21104b;

    public final long f21105c;
    public final ArrayList d;

    public final boolean f21106e;

    public final long f21107f;

    public nk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f21103a = i10;
        this.f21104b = topicsController;
        this.f21105c = j10;
        this.d = arrayList;
        this.f21106e = z10;
        this.f21107f = j11;
    }

    @Override
    public final void run() {
        switch (this.f21103a) {
            case 0:
                this.f21104b.lambda$updateTopicsWithDeletedMessages$11(this.f21105c, this.d, this.f21106e, this.f21107f);
                break;
            default:
                this.f21104b.lambda$updateTopicsWithDeletedMessages$12(this.f21105c, this.d, this.f21106e, this.f21107f);
                break;
        }
    }
}
