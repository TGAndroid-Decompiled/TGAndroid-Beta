package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ve {
    public final int f27318a;
    public boolean f27319b;
    public final String f27320c;
    public final ff d;
    public final ArrayList f27321e = new ArrayList();
    public final SparseArray f27322f = new SparseArray();

    public ve(int i7, String str, ff ffVar) {
        this.f27318a = i7;
        this.f27320c = str;
        this.d = ffVar;
    }

    public final void a(ff ffVar) {
        this.f27321e.add(ffVar);
        this.f27322f.put(ffVar.C, ffVar);
    }
}
