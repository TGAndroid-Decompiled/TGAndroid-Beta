package org.telegram.messenger;

import java.util.ArrayList;
public final class ed {
    public boolean f22209a;
    public long f22210b;
    public int f22211c;
    public int d;
    public ArrayList f22212e;

    public final void a() {
        ArrayList arrayList = this.f22212e;
        this.f22212e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
