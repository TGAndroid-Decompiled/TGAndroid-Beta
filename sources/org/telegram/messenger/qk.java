package org.telegram.messenger;

import java.util.ArrayList;
public final class qk implements Runnable {
    public final int f19356a;
    public final TopicsController f19357b;
    public final long f19358c;
    public final ArrayList d;
    public final boolean e;
    public final long f19359f;

    public qk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19356a = i10;
        this.f19357b = topicsController;
        this.f19358c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19359f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19356a) {
            case 0:
                TopicsController.x(this.f19357b, this.f19358c, this.d, this.e, this.f19359f);
                return;
            default:
                TopicsController.s(this.f19357b, this.f19358c, this.d, this.e, this.f19359f);
                return;
        }
    }
}
