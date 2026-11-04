package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class pe {
    public final int f24735a;
    public boolean f24736b;
    public final String f24737c;
    public final ye d;
    public final ArrayList f24738e = new ArrayList();
    public final SparseArray f24739f = new SparseArray();

    public pe(int i3, String str, ye yeVar) {
        this.f24735a = i3;
        this.f24737c = str;
        this.d = yeVar;
    }

    public final void a(ye yeVar) {
        this.f24738e.add(yeVar);
        this.f24739f.put(yeVar.C, yeVar);
    }
}
