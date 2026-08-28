package org.telegram.messenger;

import java.util.ArrayList;
public final class ik implements Runnable {
    public final int f20623a;
    public final TopicsController f20624b;
    public final long f20625c;
    public final ArrayList d;
    public final boolean f20626e;
    public final long f20627f;

    public ik(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i9) {
        this.f20623a = i9;
        this.f20624b = topicsController;
        this.f20625c = j10;
        this.d = arrayList;
        this.f20626e = z10;
        this.f20627f = j11;
    }

    @Override
    public final void run() {
        switch (this.f20623a) {
            case 0:
                TopicsController.x(this.f20624b, this.f20625c, this.d, this.f20626e, this.f20627f);
                return;
            default:
                TopicsController.s(this.f20624b, this.f20625c, this.d, this.f20626e, this.f20627f);
                return;
        }
    }
}
