package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.kz0;
public final class n8 implements Runnable {
    public final int f3383a;
    public final int f3384b;
    public final Object f3385c;
    public final Object d;
    public final Object e;

    public n8(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f3383a = 1;
        this.f3384b = i10;
        this.f3385c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.n8.run():void");
    }

    public n8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f3383a = i11;
        this.d = obj;
        this.f3384b = i10;
        this.f3385c = obj2;
        this.e = obj3;
    }

    public n8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f3383a = i11;
        this.d = obj;
        this.f3385c = obj2;
        this.f3384b = i10;
        this.e = obj3;
    }

    public n8(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f3383a = i11;
        this.d = obj;
        this.f3385c = obj2;
        this.e = obj3;
        this.f3384b = i10;
    }

    public n8(d40 d40Var, String str, int i10, ArrayList arrayList) {
        this.f3383a = 20;
        this.d = d40Var;
        this.e = str;
        this.f3384b = i10;
        this.f3385c = arrayList;
    }

    public n8(kz0 kz0Var, int i10, String str, ArrayList arrayList) {
        this.f3383a = 29;
        this.d = kz0Var;
        this.f3384b = i10;
        this.e = str;
        this.f3385c = arrayList;
    }
}
