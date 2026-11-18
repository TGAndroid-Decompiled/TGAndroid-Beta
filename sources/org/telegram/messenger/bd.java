package org.telegram.messenger;

import java.util.ArrayList;
public final class bd {
    public boolean f23054a;
    public long f23055b;
    public int f23056c;
    public int d;
    public ArrayList f23057e;

    public final void a() {
        ArrayList arrayList = this.f23057e;
        this.f23057e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
