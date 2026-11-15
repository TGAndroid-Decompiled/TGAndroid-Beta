package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ve {
    public final int f26969a;
    public boolean f26970b;
    public final String f26971c;
    public final ff d;
    public final ArrayList f26972e = new ArrayList();
    public final SparseArray f26973f = new SparseArray();

    public ve(int i7, String str, ff ffVar) {
        this.f26969a = i7;
        this.f26971c = str;
        this.d = ffVar;
    }

    public final void a(ff ffVar) {
        this.f26972e.add(ffVar);
        this.f26973f.put(ffVar.C, ffVar);
    }
}
