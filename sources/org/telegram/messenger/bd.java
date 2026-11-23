package org.telegram.messenger;

import java.util.ArrayList;
public final class bd {
    public boolean f23179a;
    public long f23180b;
    public int f23181c;
    public int d;
    public ArrayList f23182e;

    public final void a() {
        ArrayList arrayList = this.f23182e;
        this.f23182e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
