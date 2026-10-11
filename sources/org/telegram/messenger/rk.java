package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19087a;
    public final TopicsController f19088b;
    public final long f19089c;
    public final ArrayList d;
    public final boolean f19090e;
    public final long f19091f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19087a = i10;
        this.f19088b = topicsController;
        this.f19089c = j3;
        this.d = arrayList;
        this.f19090e = z10;
        this.f19091f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19087a) {
            case 0:
                TopicsController.x(this.f19088b, this.f19089c, this.d, this.f19090e, this.f19091f);
                return;
            default:
                TopicsController.s(this.f19088b, this.f19089c, this.d, this.f19090e, this.f19091f);
                return;
        }
    }
}
