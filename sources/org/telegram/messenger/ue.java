package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ue {
    public final int f27259a;
    public boolean f27260b;
    public final String f27261c;
    public final ef d;
    public final ArrayList f27262e = new ArrayList();
    public final SparseArray f27263f = new SparseArray();

    public ue(int i7, String str, ef efVar) {
        this.f27259a = i7;
        this.f27261c = str;
        this.d = efVar;
    }

    public final void a(ef efVar) {
        this.f27262e.add(efVar);
        this.f27263f.put(efVar.C, efVar);
    }
}
