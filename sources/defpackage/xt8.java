package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class xt8 extends ogc {
    public boolean a;
    public final oea b;

    public xt8(oea oeaVar) {
        this.b = oeaVar;
    }

    @Override
    public final void a(ArrayList arrayList) {
        oea oeaVar = this.b;
        pp8 pp8Var = oeaVar.w;
        vgc vgcVar = oeaVar.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2 && intValue != 0) {
                arrayList2.add(num);
            }
        }
        int f = f(vgcVar.getCurrentPosition());
        v3b v3bVar = oeaVar.c;
        v3bVar.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = v3bVar.h;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            a4b a4bVar = (a4b) obj2;
            hashMap.put(Integer.valueOf(a4bVar.a), a4bVar);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i < size3) {
            Object obj3 = arrayList2.get(i);
            i++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            a4b a4bVar2 = (a4b) hashMap.get(num2);
            if (a4bVar2 != null) {
                arrayList4.add(a4bVar2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f >= 0) {
            int i4 = i(f);
            vgcVar.f(0.0f, i4, i4);
        }
        gm.r(pp8Var);
        gm.d3(pp8Var, 1000L);
    }

    @Override
    public final boolean c(int i) {
        if (i == 0) {
            return false;
        }
        if (this.a && i == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i) {
        if (i == -1) {
            return null;
        }
        return new View(this.b.getContext());
    }

    @Override
    public final int e() {
        return this.b.c.h.size() + 1 + (this.a ? 1 : 0);
    }

    @Override
    public final int f(int i) {
        if (i == 0) {
            return 0;
        }
        if (this.a && i == e() - 1) {
            return -1;
        }
        return ((a4b) this.b.c.h.get(i - 1)).a;
    }

    @Override
    public final CharSequence g(int i) {
        if (i == 0) {
            return jb6.M0(2131744475, null);
        }
        if (this.a && i == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) jb6.M0(2131744496, null));
            pn2 pn2Var = new pn2(2131232577, 0);
            pn2Var.H = 0.8f;
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((a4b) this.b.c.h.get(i - 1)).b;
    }

    @Override
    public final int h(int i) {
        if (this.a && i == e() - 1) {
            return -1;
        }
        return i;
    }

    public final int i(int i) {
        if (i == 0) {
            return 0;
        }
        int c = this.b.c.c(i);
        if (c == -1) {
            return -1;
        }
        return c + 1;
    }

    @Override
    public final void b(View view, int i, int i2) {
    }
}
