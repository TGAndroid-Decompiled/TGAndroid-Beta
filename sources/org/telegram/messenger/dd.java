package org.telegram.messenger;

import java.util.ArrayList;
public final class dd {
    public boolean f21982a;
    public long f21983b;
    public int f21984c;
    public int d;
    public ArrayList f21985e;

    public final void a() {
        ArrayList arrayList = this.f21985e;
        this.f21985e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
