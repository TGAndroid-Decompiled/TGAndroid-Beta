package org.telegram.messenger;

import java.util.ArrayList;
public final class xk implements Runnable {
    public final int f19607a;
    public final TopicsController f19608b;
    public final long f19609c;
    public final ArrayList d;
    public final boolean f19610e;
    public final long f19611f;

    public xk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19607a = i10;
        this.f19608b = topicsController;
        this.f19609c = j3;
        this.d = arrayList;
        this.f19610e = z10;
        this.f19611f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19607a) {
            case 0:
                TopicsController.x(this.f19608b, this.f19609c, this.d, this.f19610e, this.f19611f);
                return;
            default:
                TopicsController.s(this.f19608b, this.f19609c, this.d, this.f19610e, this.f19611f);
                return;
        }
    }
}
