package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
public final class q2a implements pcc {
    public final byte a;
    public final t2a b;

    public q2a(t2a t2aVar, byte b) {
        this.a = b;
        this.b = t2aVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        t2a t2aVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ArrayList arrayList = t2aVar.b2;
                li7 li7Var = t2aVar.q2;
                t2aVar.i2 = str;
                byte b2 = t2aVar.m2;
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            t2aVar.i1(false, true);
                            t2aVar.f1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        hl.r(li7Var);
                        arrayList.clear();
                        arrayList.addAll(on0.f(t2aVar.l2.id));
                        t2aVar.i1(false, true);
                        t2aVar.f1(true);
                        return;
                    } else {
                        hl.r(li7Var);
                        hl.d3(li7Var, 350L);
                        return;
                    }
                }
                hl.r(li7Var);
                hl.d3(li7Var, 350L);
                return;
            default:
                List list = (List) obj;
                ArrayList arrayList2 = t2aVar.b2;
                if (!TextUtils.isEmpty(t2aVar.i2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    t2aVar.j1(true, true);
                    t2aVar.f1(true);
                    return;
                }
                return;
        }
    }
}
