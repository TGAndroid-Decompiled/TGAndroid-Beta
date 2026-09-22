package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.q30;
public final class c9 implements Runnable {
    public final int f644a;
    public final int f645b;
    public final Object f646c;
    public final Object d;
    public final Object e;

    public c9(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f644a = 1;
        this.f645b = i10;
        this.f646c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.c9.run():void");
    }

    public c9(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f644a = i11;
        this.d = obj;
        this.f645b = i10;
        this.f646c = obj2;
        this.e = obj3;
    }

    public c9(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f644a = i11;
        this.d = obj;
        this.f646c = obj2;
        this.f645b = i10;
        this.e = obj3;
    }

    public c9(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f644a = i11;
        this.d = obj;
        this.f646c = obj2;
        this.e = obj3;
        this.f645b = i10;
    }

    public c9(q30 q30Var, String str, int i10, ArrayList arrayList) {
        this.f644a = 19;
        this.d = q30Var;
        this.e = str;
        this.f645b = i10;
        this.f646c = arrayList;
    }

    public c9(az0 az0Var, int i10, String str, ArrayList arrayList) {
        this.f644a = 28;
        this.d = az0Var;
        this.f645b = i10;
        this.e = str;
        this.f646c = arrayList;
    }
}
