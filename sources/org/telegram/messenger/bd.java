package org.telegram.messenger;

import java.util.ArrayList;
public final class bd {
    public boolean f23082a;
    public long f23083b;
    public int f23084c;
    public int d;
    public ArrayList f23085e;

    public final void a() {
        ArrayList arrayList = this.f23085e;
        this.f23085e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
