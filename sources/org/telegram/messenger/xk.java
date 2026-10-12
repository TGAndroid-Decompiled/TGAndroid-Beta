package org.telegram.messenger;

import java.util.ArrayList;
public final class xk implements Runnable {
    public final int f19608a;
    public final TopicsController f19609b;
    public final long f19610c;
    public final ArrayList d;
    public final boolean f19611e;
    public final long f19612f;

    public xk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19608a = i10;
        this.f19609b = topicsController;
        this.f19610c = j3;
        this.d = arrayList;
        this.f19611e = z10;
        this.f19612f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19608a) {
            case 0:
                TopicsController.x(this.f19609b, this.f19610c, this.d, this.f19611e, this.f19612f);
                return;
            default:
                TopicsController.s(this.f19609b, this.f19610c, this.d, this.f19611e, this.f19612f);
                return;
        }
    }
}
