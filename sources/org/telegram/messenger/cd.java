package org.telegram.messenger;

import java.util.ArrayList;
public final class cd {
    public boolean f22854a;
    public long f22855b;
    public int f22856c;
    public int d;
    public ArrayList f22857e;

    public final void a() {
        ArrayList arrayList = this.f22857e;
        this.f22857e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
