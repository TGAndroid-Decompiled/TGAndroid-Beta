package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ve {
    public final int f26968a;
    public boolean f26969b;
    public final String f26970c;
    public final ff d;
    public final ArrayList f26971e = new ArrayList();
    public final SparseArray f26972f = new SparseArray();

    public ve(int i7, String str, ff ffVar) {
        this.f26968a = i7;
        this.f26970c = str;
        this.d = ffVar;
    }

    public final void a(ff ffVar) {
        this.f26971e.add(ffVar);
        this.f26972f.put(ffVar.C, ffVar);
    }
}
