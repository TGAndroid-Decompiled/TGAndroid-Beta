package org.telegram.messenger;

import java.util.ArrayList;
public final class nk implements Runnable {
    public final int f19124a;
    public final TopicsController f19125b;
    public final long f19126c;
    public final ArrayList d;
    public final boolean e;
    public final long f19127f;

    public nk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19124a = i10;
        this.f19125b = topicsController;
        this.f19126c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19127f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19124a) {
            case 0:
                TopicsController.x(this.f19125b, this.f19126c, this.d, this.e, this.f19127f);
                return;
            default:
                TopicsController.s(this.f19125b, this.f19126c, this.d, this.e, this.f19127f);
                return;
        }
    }
}
