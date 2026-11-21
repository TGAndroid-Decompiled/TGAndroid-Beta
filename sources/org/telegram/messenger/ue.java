package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ue {
    public final int f27183a;
    public boolean f27184b;
    public final String f27185c;
    public final ef d;
    public final ArrayList f27186e = new ArrayList();
    public final SparseArray f27187f = new SparseArray();

    public ue(int i7, String str, ef efVar) {
        this.f27183a = i7;
        this.f27185c = str;
        this.d = efVar;
    }

    public final void a(ef efVar) {
        this.f27186e.add(efVar);
        this.f27187f.put(efVar.C, efVar);
    }
}
