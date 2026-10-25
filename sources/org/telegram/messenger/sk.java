package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f21275a;
    public final TopicsController f21276b;
    public final long f21277c;
    public final ArrayList d;
    public final boolean e;
    public final long f21278f;

    public sk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f21275a = i10;
        this.f21276b = topicsController;
        this.f21277c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f21278f = j11;
    }

    @Override
    public final void run() {
        switch (this.f21275a) {
            case 0:
                TopicsController.x(this.f21276b, this.f21277c, this.d, this.e, this.f21278f);
                return;
            default:
                TopicsController.s(this.f21276b, this.f21277c, this.d, this.e, this.f21278f);
                return;
        }
    }
}
