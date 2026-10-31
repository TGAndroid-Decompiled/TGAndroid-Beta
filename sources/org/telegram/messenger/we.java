package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class we {
    public final int f19085a;
    public boolean f19086b;
    public final String f19087c;
    public final ef d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f19088f = new SparseArray();

    public we(int i10, String str, ef efVar) {
        this.f19085a = i10;
        this.f19087c = str;
        this.d = efVar;
    }

    public final void a(ef efVar) {
        this.e.add(efVar);
        this.f19088f.put(efVar.C, efVar);
    }
}
