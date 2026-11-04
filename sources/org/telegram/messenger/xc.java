package org.telegram.messenger;

import java.util.ArrayList;
public final class xc {
    public boolean f26361a;
    public long f26362b;
    public int f26363c;
    public int d;
    public ArrayList f26364e;

    public final void a() {
        ArrayList arrayList = this.f26364e;
        this.f26364e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((Runnable) arrayList.get(i3)).run();
        }
    }
}
