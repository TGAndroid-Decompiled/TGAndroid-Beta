package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lc2 implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public lc2(Object obj, Object obj2, Object obj3, int i, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((oc2) obj4).a();
                jj.D((Context) obj3, (vnb) obj2, new wg(this.b, (nc2) obj, (byte) 4));
                return;
            case 1:
                bn3 bn3Var = (bn3) obj4;
                String str = (String) obj3;
                cm3 cm3Var = (cm3) obj2;
                zv4 zv4Var = (zv4) obj;
                bn3Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                    arrayList3.add(str);
                    arrayList4.add(cm3Var.a());
                }
                ArrayList n = a5c.n(null);
                int size = n.size();
                int i = 0;
                while (i < size) {
                    Object obj5 = n.get(i);
                    i++;
                    t4c t4cVar = (t4c) obj5;
                    if (t4cVar != null && hashSet.add(t4cVar.a)) {
                        arrayList3.add(t4cVar.a);
                        arrayList4.add(t4cVar.b);
                    }
                }
                ArrayList m = a5c.m();
                int size2 = m.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj6 = m.get(i2);
                    i2++;
                    t4c t4cVar2 = (t4c) obj6;
                    if (t4cVar2 != null && hashSet.add(t4cVar2.a)) {
                        arrayList3.add(t4cVar2.a);
                        arrayList4.add(t4cVar2.b);
                    }
                }
                cm3 cm3Var2 = bn3Var.K;
                if (cm3Var2 != null && cm3Var2.e != null && bn3Var.J != null) {
                    z = true;
                } else {
                    z = false;
                }
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    String str2 = (String) arrayList3.get(i3);
                    Context context = bn3Var.h;
                    CharSequence charSequence = (CharSequence) arrayList4.get(i3);
                    if (z && str2.equals(bn3Var.K.e)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new l7(context, charSequence, null, this.b, z2));
                    arrayList2.add(new wm3(bn3Var, str2, (byte) 1));
                }
                zv4Var.h(arrayList, arrayList2);
                return;
            default:
                og2 og2Var = (og2) obj2;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) obj;
                ((nx0) obj4).dismiss();
                Activity W = hl.W((Activity) obj3);
                if (W != null) {
                    uc7.e1().edit().putBoolean("callmiconstart", og2Var.a.q).apply();
                    xkc.g(W, this.b, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
