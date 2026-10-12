package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.uz0;
public final class d9 implements Runnable {
    public final int f832a;
    public final int f833b;
    public final Object f834c;
    public final Object d;
    public final Object f835e;

    public d9(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f832a = 1;
        this.f833b = i10;
        this.f834c = arrayList;
        this.d = hashMap;
        this.f835e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.d9.run():void");
    }

    public d9(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f832a = i11;
        this.d = obj;
        this.f833b = i10;
        this.f834c = obj2;
        this.f835e = obj3;
    }

    public d9(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f832a = i11;
        this.d = obj;
        this.f834c = obj2;
        this.f833b = i10;
        this.f835e = obj3;
    }

    public d9(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f832a = i11;
        this.d = obj;
        this.f834c = obj2;
        this.f835e = obj3;
        this.f833b = i10;
    }

    public d9(k40 k40Var, String str, int i10, ArrayList arrayList) {
        this.f832a = 20;
        this.d = k40Var;
        this.f835e = str;
        this.f833b = i10;
        this.f834c = arrayList;
    }

    public d9(uz0 uz0Var, int i10, String str, ArrayList arrayList) {
        this.f832a = 29;
        this.d = uz0Var;
        this.f833b = i10;
        this.f835e = str;
        this.f834c = arrayList;
    }
}
