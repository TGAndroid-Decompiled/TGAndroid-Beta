package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.zy0;
public final class c9 implements Runnable {
    public final int f656a;
    public final int f657b;
    public final Object f658c;
    public final Object d;
    public final Object e;

    public c9(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f656a = 1;
        this.f657b = i10;
        this.f658c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.c9.run():void");
    }

    public c9(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f656a = i11;
        this.d = obj;
        this.f657b = i10;
        this.f658c = obj2;
        this.e = obj3;
    }

    public c9(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f656a = i11;
        this.d = obj;
        this.f658c = obj2;
        this.f657b = i10;
        this.e = obj3;
    }

    public c9(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f656a = i11;
        this.d = obj;
        this.f658c = obj2;
        this.e = obj3;
        this.f657b = i10;
    }

    public c9(t30 t30Var, String str, int i10, ArrayList arrayList) {
        this.f656a = 19;
        this.d = t30Var;
        this.e = str;
        this.f657b = i10;
        this.f658c = arrayList;
    }

    public c9(zy0 zy0Var, int i10, String str, ArrayList arrayList) {
        this.f656a = 28;
        this.d = zy0Var;
        this.f657b = i10;
        this.e = str;
        this.f658c = arrayList;
    }
}
