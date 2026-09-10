package di;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.eo;
public final class q implements Runnable {
    public final int f6850a;
    public final int f6851b;
    public final Object f6852c;
    public final Object d;
    public final Object e;

    public q(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f6850a = 0;
        this.f6851b = i10;
        this.f6852c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.q.run():void");
    }

    public q(fg.h0 h0Var, ArrayList arrayList, int i10, org.telegram.ui.Cells.u3 u3Var) {
        this.f6850a = 2;
        this.d = h0Var;
        this.f6852c = arrayList;
        this.f6851b = i10;
        this.e = u3Var;
    }

    public q(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f6850a = i11;
        this.f6852c = obj;
        this.f6851b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public q(Object obj, int i10, ArrayList arrayList, Serializable serializable, int i11) {
        this.f6850a = i11;
        this.d = obj;
        this.f6851b = i10;
        this.f6852c = arrayList;
        this.e = serializable;
    }

    public q(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f6850a = i11;
        this.f6852c = obj;
        this.d = obj2;
        this.f6851b = i10;
        this.e = obj3;
    }

    public q(Object obj, Object obj2, int i10, ArrayList arrayList, int i11) {
        this.f6850a = i11;
        this.d = obj;
        this.e = obj2;
        this.f6851b = i10;
        this.f6852c = arrayList;
    }

    public q(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f6850a = i11;
        this.f6852c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f6851b = i10;
    }

    public q(eo eoVar, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f6850a = 12;
        this.d = eoVar;
        this.f6852c = arrayList;
        this.e = arrayList2;
        this.f6851b = i10;
    }

    public q(zy0 zy0Var, int i10, String str, ArrayList arrayList) {
        this.f6850a = 28;
        this.d = zy0Var;
        this.f6851b = i10;
        this.e = str;
        this.f6852c = arrayList;
    }
}
