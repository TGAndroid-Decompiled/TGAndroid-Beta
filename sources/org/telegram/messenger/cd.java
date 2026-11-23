package org.telegram.messenger;

import java.util.ArrayList;
public final class cd {
    public boolean f23295a;
    public long f23296b;
    public int f23297c;
    public int d;
    public ArrayList f23298e;

    public final void a() {
        ArrayList arrayList = this.f23298e;
        this.f23298e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
