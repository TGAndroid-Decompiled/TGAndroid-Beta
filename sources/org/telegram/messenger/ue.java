package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ue {
    public final int f27155a;
    public boolean f27156b;
    public final String f27157c;
    public final ef d;
    public final ArrayList f27158e = new ArrayList();
    public final SparseArray f27159f = new SparseArray();

    public ue(int i7, String str, ef efVar) {
        this.f27155a = i7;
        this.f27157c = str;
        this.d = efVar;
    }

    public final void a(ef efVar) {
        this.f27158e.add(efVar);
        this.f27159f.put(efVar.C, efVar);
    }
}
