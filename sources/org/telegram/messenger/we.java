package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class we {
    public final int f26286a;
    public boolean f26287b;
    public final String f26288c;
    public final gf d;
    public final ArrayList f26289e = new ArrayList();
    public final SparseArray f26290f = new SparseArray();

    public we(int i7, String str, gf gfVar) {
        this.f26286a = i7;
        this.f26288c = str;
        this.d = gfVar;
    }

    public final void a(gf gfVar) {
        this.f26289e.add(gfVar);
        this.f26290f.put(gfVar.C, gfVar);
    }
}
