package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.u30;
public final class c9 implements Runnable {
    public final int f708a;
    public final int f709b;
    public final Object f710c;
    public final Object d;
    public final Object f711e;

    public c9(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f708a = 1;
        this.f709b = i10;
        this.f710c = arrayList;
        this.d = hashMap;
        this.f711e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.c9.run():void");
    }

    public c9(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f708a = i11;
        this.d = obj;
        this.f709b = i10;
        this.f710c = obj2;
        this.f711e = obj3;
    }

    public c9(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f708a = i11;
        this.d = obj;
        this.f710c = obj2;
        this.f709b = i10;
        this.f711e = obj3;
    }

    public c9(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f708a = i11;
        this.d = obj;
        this.f710c = obj2;
        this.f711e = obj3;
        this.f709b = i10;
    }

    public c9(u30 u30Var, String str, int i10, ArrayList arrayList) {
        this.f708a = 19;
        this.d = u30Var;
        this.f711e = str;
        this.f709b = i10;
        this.f710c = arrayList;
    }

    public c9(jz0 jz0Var, int i10, String str, ArrayList arrayList) {
        this.f708a = 28;
        this.d = jz0Var;
        this.f709b = i10;
        this.f711e = str;
        this.f710c = arrayList;
    }
}
