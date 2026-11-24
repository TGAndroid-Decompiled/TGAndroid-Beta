package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class wr8 extends oec {
    public boolean a;
    public final oca b;

    public wr8(oca ocaVar) {
        this.b = ocaVar;
    }

    @Override
    public final void a(ArrayList arrayList) {
        oca ocaVar = this.b;
        sr8 sr8Var = ocaVar.w;
        vec vecVar = ocaVar.b;
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
        int f = f(vecVar.getCurrentPosition());
        u1b u1bVar = ocaVar.c;
        u1bVar.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = u1bVar.h;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            z1b z1bVar = (z1b) obj2;
            hashMap.put(Integer.valueOf(z1bVar.a), z1bVar);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i < size3) {
            Object obj3 = arrayList2.get(i);
            i++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            z1b z1bVar2 = (z1b) hashMap.get(num2);
            if (z1bVar2 != null) {
                arrayList4.add(z1bVar2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f >= 0) {
            int i4 = i(f);
            vecVar.f(0.0f, i4, i4);
        }
        gl.r(sr8Var);
        gl.e3(sr8Var, 1000L);
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
        return ((z1b) this.b.c.h.get(i - 1)).a;
    }

    @Override
    public final CharSequence g(int i) {
        if (i == 0) {
            return k96.M0(2131744549, null);
        }
        if (this.a && i == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) k96.M0(2131744570, null));
            cm2 cm2Var = new cm2(2131232565, 0);
            cm2Var.H = 0.8f;
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((z1b) this.b.c.h.get(i - 1)).b;
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
