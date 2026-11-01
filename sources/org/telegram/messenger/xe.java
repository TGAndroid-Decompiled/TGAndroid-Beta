package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class xe {
    public final int f19428a;
    public boolean f19429b;
    public final String f19430c;
    public final ff d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f19431f = new SparseArray();

    public xe(int i10, String str, ff ffVar) {
        this.f19428a = i10;
        this.f19430c = str;
        this.d = ffVar;
    }

    public final void a(ff ffVar) {
        this.e.add(ffVar);
        this.f19431f.put(ffVar.C, ffVar);
    }
}
