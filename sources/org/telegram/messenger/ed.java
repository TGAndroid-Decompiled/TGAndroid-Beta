package org.telegram.messenger;

import java.util.ArrayList;
public final class ed {
    public boolean f22205a;
    public long f22206b;
    public int f22207c;
    public int d;
    public ArrayList f22208e;

    public final void a() {
        ArrayList arrayList = this.f22208e;
        this.f22208e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
