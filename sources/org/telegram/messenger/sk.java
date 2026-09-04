package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f19005a;
    public final TopicsController f19006b;
    public final long f19007c;
    public final ArrayList d;
    public final boolean f19008e;
    public final long f19009f;

    public sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19005a = i10;
        this.f19006b = topicsController;
        this.f19007c = j3;
        this.d = arrayList;
        this.f19008e = z10;
        this.f19009f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19005a) {
            case 0:
                TopicsController.x(this.f19006b, this.f19007c, this.d, this.f19008e, this.f19009f);
                return;
            default:
                TopicsController.s(this.f19006b, this.f19007c, this.d, this.f19008e, this.f19009f);
                return;
        }
    }
}
