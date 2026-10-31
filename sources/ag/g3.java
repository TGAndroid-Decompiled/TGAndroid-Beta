package ag;

import android.util.SparseIntArray;
import bi.n4;
import java.util.ArrayList;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.y20;
public final class g3 implements Runnable {
    public final int f534a;
    public final int f535b;
    public final Object f536c;
    public final Object d;
    public final Object e;

    public g3(int i10, lg.s sVar, SparseIntArray sparseIntArray, n4 n4Var) {
        this.f534a = 7;
        this.f535b = i10;
        this.f536c = sVar;
        this.d = sparseIntArray;
        this.e = n4Var;
    }

    private final void a() {
        sx0 sx0Var = (sx0) this.f536c;
        String str = (String) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        if (this.f535b == sx0Var.K) {
            sx0Var.J = str;
            sx0Var.I = 2;
            arrayList.remove(arrayList.size() - 1);
            if (!arrayList.isEmpty()) {
                sx0Var.f30383y = false;
                sx0Var.f30381w = false;
                sx0Var.c();
                jg.l0 l0Var = sx0Var.d;
                if (l0Var != null) {
                    l0Var.setVisibility(0);
                    sx0Var.d.invalidate();
                }
                sx0Var.f30382x = arrayList;
                fg.j jVar = sx0Var.f30376f;
                if (jVar != null) {
                    jVar.f();
                    return;
                }
                return;
            }
            sx0Var.f30383y = true;
            sx0Var.f();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ag.g3.run():void");
    }

    public g3(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f534a = i11;
        this.f536c = obj;
        this.f535b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public g3(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f534a = i11;
        this.f536c = obj;
        this.d = obj2;
        this.f535b = i10;
        this.e = obj3;
    }

    public g3(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f534a = i11;
        this.f536c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f535b = i10;
    }

    public g3(y20 y20Var, String str, int i10, ArrayList arrayList) {
        this.f534a = 19;
        this.f536c = y20Var;
        this.e = str;
        this.f535b = i10;
        this.d = arrayList;
    }

    public g3(sx0 sx0Var, int i10, String str, ArrayList arrayList) {
        this.f534a = 28;
        this.f536c = sx0Var;
        this.f535b = i10;
        this.e = str;
        this.d = arrayList;
    }
}
