package org.telegram.messenger;

import java.util.ArrayList;
public final class cd {
    public boolean f23259a;
    public long f23260b;
    public int f23261c;
    public int d;
    public ArrayList f23262e;

    public final void a() {
        ArrayList arrayList = this.f23262e;
        this.f23262e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
