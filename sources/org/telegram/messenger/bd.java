package org.telegram.messenger;

import java.util.ArrayList;
public final class bd {
    public boolean f23057a;
    public long f23058b;
    public int f23059c;
    public int d;
    public ArrayList f23060e;

    public final void a() {
        ArrayList arrayList = this.f23060e;
        this.f23060e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
