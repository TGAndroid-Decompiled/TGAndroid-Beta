package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class we {
    public final int f26301a;
    public boolean f26302b;
    public final String f26303c;
    public final gf d;
    public final ArrayList f26304e = new ArrayList();
    public final SparseArray f26305f = new SparseArray();

    public we(int i7, String str, gf gfVar) {
        this.f26301a = i7;
        this.f26303c = str;
        this.d = gfVar;
    }

    public final void a(gf gfVar) {
        this.f26304e.add(gfVar);
        this.f26305f.put(gfVar.C, gfVar);
    }
}
