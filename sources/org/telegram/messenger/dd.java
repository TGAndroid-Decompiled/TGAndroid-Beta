package org.telegram.messenger;

import java.util.ArrayList;
public final class dd {
    public boolean f21989a;
    public long f21990b;
    public int f21991c;
    public int d;
    public ArrayList f21992e;

    public final void a() {
        ArrayList arrayList = this.f21992e;
        this.f21992e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
