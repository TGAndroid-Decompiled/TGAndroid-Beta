package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class we {
    public final int f26294a;
    public boolean f26295b;
    public final String f26296c;
    public final gf d;
    public final ArrayList f26297e = new ArrayList();
    public final SparseArray f26298f = new SparseArray();

    public we(int i7, String str, gf gfVar) {
        this.f26294a = i7;
        this.f26296c = str;
        this.d = gfVar;
    }

    public final void a(gf gfVar) {
        this.f26297e.add(gfVar);
        this.f26298f.put(gfVar.C, gfVar);
    }
}
