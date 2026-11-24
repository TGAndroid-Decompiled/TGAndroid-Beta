package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
public final class y0a implements qac {
    public final byte a;
    public final b1a b;

    public y0a(b1a b1aVar, byte b) {
        this.a = b;
        this.b = b1aVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        b1a b1aVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ArrayList arrayList = b1aVar.b2;
                ei7 ei7Var = b1aVar.q2;
                b1aVar.i2 = str;
                byte b2 = b1aVar.m2;
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            b1aVar.h1(false, true);
                            b1aVar.e1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        gm.r(ei7Var);
                        arrayList.clear();
                        arrayList.addAll(oo0.f(b1aVar.l2.id));
                        b1aVar.h1(false, true);
                        b1aVar.e1(true);
                        return;
                    } else {
                        gm.r(ei7Var);
                        gm.d3(ei7Var, 350L);
                        return;
                    }
                }
                gm.r(ei7Var);
                gm.d3(ei7Var, 350L);
                return;
            default:
                List list = (List) obj;
                ArrayList arrayList2 = b1aVar.b2;
                if (!TextUtils.isEmpty(b1aVar.i2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    b1aVar.i1(true, true);
                    b1aVar.e1(true);
                    return;
                }
                return;
        }
    }
}
