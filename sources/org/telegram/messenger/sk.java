package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f19032a;
    public final TopicsController f19033b;
    public final long f19034c;
    public final ArrayList d;
    public final boolean f19035e;
    public final long f19036f;

    public sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19032a = i10;
        this.f19033b = topicsController;
        this.f19034c = j3;
        this.d = arrayList;
        this.f19035e = z10;
        this.f19036f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19032a) {
            case 0:
                TopicsController.x(this.f19033b, this.f19034c, this.d, this.f19035e, this.f19036f);
                return;
            default:
                TopicsController.s(this.f19033b, this.f19034c, this.d, this.f19035e, this.f19036f);
                return;
        }
    }
}
