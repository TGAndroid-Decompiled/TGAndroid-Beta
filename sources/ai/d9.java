package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.oz0;
public final class d9 implements Runnable {
    public final int f834a;
    public final int f835b;
    public final Object f836c;
    public final Object d;
    public final Object f837e;

    public d9(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f834a = 1;
        this.f835b = i10;
        this.f836c = arrayList;
        this.d = hashMap;
        this.f837e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.d9.run():void");
    }

    public d9(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f834a = i11;
        this.d = obj;
        this.f835b = i10;
        this.f836c = obj2;
        this.f837e = obj3;
    }

    public d9(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f834a = i11;
        this.d = obj;
        this.f836c = obj2;
        this.f835b = i10;
        this.f837e = obj3;
    }

    public d9(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f834a = i11;
        this.d = obj;
        this.f836c = obj2;
        this.f837e = obj3;
        this.f835b = i10;
    }

    public d9(h40 h40Var, String str, int i10, ArrayList arrayList) {
        this.f834a = 19;
        this.d = h40Var;
        this.f837e = str;
        this.f835b = i10;
        this.f836c = arrayList;
    }

    public d9(oz0 oz0Var, int i10, String str, ArrayList arrayList) {
        this.f834a = 28;
        this.d = oz0Var;
        this.f835b = i10;
        this.f837e = str;
        this.f836c = arrayList;
    }
}
