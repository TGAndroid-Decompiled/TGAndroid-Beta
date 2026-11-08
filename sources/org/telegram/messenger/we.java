package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class we {
    public final int f26297a;
    public boolean f26298b;
    public final String f26299c;
    public final gf d;
    public final ArrayList f26300e = new ArrayList();
    public final SparseArray f26301f = new SparseArray();

    public we(int i7, String str, gf gfVar) {
        this.f26297a = i7;
        this.f26299c = str;
        this.d = gfVar;
    }

    public final void a(gf gfVar) {
        this.f26300e.add(gfVar);
        this.f26301f.put(gfVar.C, gfVar);
    }
}
