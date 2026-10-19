package org.telegram.messenger;

import java.util.ArrayList;
public final class ok implements Runnable {
    public final int f19202a;
    public final TopicsController f19203b;
    public final long f19204c;
    public final ArrayList d;
    public final boolean e;
    public final long f19205f;

    public ok(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19202a = i10;
        this.f19203b = topicsController;
        this.f19204c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19205f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19202a) {
            case 0:
                TopicsController.x(this.f19203b, this.f19204c, this.d, this.e, this.f19205f);
                return;
            default:
                TopicsController.s(this.f19203b, this.f19204c, this.d, this.e, this.f19205f);
                return;
        }
    }
}
