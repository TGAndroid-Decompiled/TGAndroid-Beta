package org.telegram.messenger;

import java.util.ArrayList;
public final class pk implements Runnable {
    public final int f19327a;
    public final TopicsController f19328b;
    public final long f19329c;
    public final ArrayList d;
    public final boolean e;
    public final long f19330f;

    public pk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19327a = i10;
        this.f19328b = topicsController;
        this.f19329c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19330f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19327a) {
            case 0:
                TopicsController.x(this.f19328b, this.f19329c, this.d, this.e, this.f19330f);
                return;
            default:
                TopicsController.s(this.f19328b, this.f19329c, this.d, this.e, this.f19330f);
                return;
        }
    }
}
