package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.yy0;
public final class c9 implements Runnable {
    public final int f653a;
    public final int f654b;
    public final Object f655c;
    public final Object d;
    public final Object e;

    public c9(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f653a = 1;
        this.f654b = i10;
        this.f655c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.c9.run():void");
    }

    public c9(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f653a = i11;
        this.d = obj;
        this.f654b = i10;
        this.f655c = obj2;
        this.e = obj3;
    }

    public c9(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f653a = i11;
        this.d = obj;
        this.f655c = obj2;
        this.f654b = i10;
        this.e = obj3;
    }

    public c9(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f653a = i11;
        this.d = obj;
        this.f655c = obj2;
        this.e = obj3;
        this.f654b = i10;
    }

    public c9(s30 s30Var, String str, int i10, ArrayList arrayList) {
        this.f653a = 19;
        this.d = s30Var;
        this.e = str;
        this.f654b = i10;
        this.f655c = arrayList;
    }

    public c9(yy0 yy0Var, int i10, String str, ArrayList arrayList) {
        this.f653a = 28;
        this.d = yy0Var;
        this.f654b = i10;
        this.e = str;
        this.f655c = arrayList;
    }
}
