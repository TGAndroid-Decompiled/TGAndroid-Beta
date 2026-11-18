package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ue {
    public final int f27157a;
    public boolean f27158b;
    public final String f27159c;
    public final ef d;
    public final ArrayList f27160e = new ArrayList();
    public final SparseArray f27161f = new SparseArray();

    public ue(int i7, String str, ef efVar) {
        this.f27157a = i7;
        this.f27159c = str;
        this.d = efVar;
    }

    public final void a(ef efVar) {
        this.f27160e.add(efVar);
        this.f27161f.put(efVar.C, efVar);
    }
}
