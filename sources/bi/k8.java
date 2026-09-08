package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.q30;
public final class k8 implements Runnable {
    public final int f3237a;
    public final int f3238b;
    public final Object f3239c;
    public final Object d;
    public final Object f3240e;

    public k8(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.f3237a = 1;
        this.f3238b = i10;
        this.f3239c = arrayList;
        this.d = hashMap;
        this.f3240e = callback;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k8.run():void");
    }

    public k8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f3237a = i11;
        this.d = obj;
        this.f3238b = i10;
        this.f3239c = obj2;
        this.f3240e = obj3;
    }

    public k8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f3237a = i11;
        this.d = obj;
        this.f3239c = obj2;
        this.f3238b = i10;
        this.f3240e = obj3;
    }

    public k8(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f3237a = i11;
        this.d = obj;
        this.f3239c = obj2;
        this.f3240e = obj3;
        this.f3238b = i10;
    }

    public k8(q30 q30Var, String str, int i10, ArrayList arrayList) {
        this.f3237a = 19;
        this.d = q30Var;
        this.f3240e = str;
        this.f3238b = i10;
        this.f3239c = arrayList;
    }

    public k8(my0 my0Var, int i10, String str, ArrayList arrayList) {
        this.f3237a = 28;
        this.d = my0Var;
        this.f3238b = i10;
        this.f3240e = str;
        this.f3239c = arrayList;
    }
}
