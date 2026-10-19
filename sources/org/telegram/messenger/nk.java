package org.telegram.messenger;

import java.util.ArrayList;
public final class nk implements Runnable {
    public final int f19123a;
    public final TopicsController f19124b;
    public final long f19125c;
    public final ArrayList d;
    public final boolean e;
    public final long f19126f;

    public nk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19123a = i10;
        this.f19124b = topicsController;
        this.f19125c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19126f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19123a) {
            case 0:
                TopicsController.x(this.f19124b, this.f19125c, this.d, this.e, this.f19126f);
                return;
            default:
                TopicsController.s(this.f19124b, this.f19125c, this.d, this.e, this.f19126f);
                return;
        }
    }
}
