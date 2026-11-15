package org.telegram.messenger;

import java.util.ArrayList;
public final class cd {
    public boolean f22858a;
    public long f22859b;
    public int f22860c;
    public int d;
    public ArrayList f22861e;

    public final void a() {
        ArrayList arrayList = this.f22861e;
        this.f22861e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
