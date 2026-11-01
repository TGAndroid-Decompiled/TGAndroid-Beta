package org.telegram.messenger;

import java.util.ArrayList;
public final class fw implements Runnable {
    public final int f15815a;
    public final hw f15816b;

    public fw(hw hwVar, int i10) {
        this.f15815a = i10;
        this.f15816b = hwVar;
    }

    @Override
    public final void run() {
        switch (this.f15815a) {
            case 0:
                this.f15816b.g(false);
                return;
            case 1:
                this.f15816b.f16126o = false;
                return;
            case 2:
                hw hwVar = this.f15816b;
                hwVar.f16126o = false;
                hwVar.f16123l = false;
                return;
            case 3:
                this.f15816b.l();
                return;
            default:
                hw hwVar2 = this.f15816b;
                if (!hwVar2.f16126o) {
                    hwVar2.f16126o = true;
                    ArrayList arrayList = new ArrayList(hwVar2.f16121j);
                    is a02 = is.a0(hwVar2.f16115a);
                    a02.f16331a.c(new lg(hwVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
