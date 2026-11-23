package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ve {
    public final int f27354a;
    public boolean f27355b;
    public final String f27356c;
    public final ff d;
    public final ArrayList f27357e = new ArrayList();
    public final SparseArray f27358f = new SparseArray();

    public ve(int i7, String str, ff ffVar) {
        this.f27354a = i7;
        this.f27356c = str;
        this.d = ffVar;
    }

    public final void a(ff ffVar) {
        this.f27357e.add(ffVar);
        this.f27358f.put(ffVar.C, ffVar);
    }
}
