package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class fv8 extends nic {
    public boolean a;
    public final fga b;

    public fv8(fga fgaVar) {
        this.b = fgaVar;
    }

    @Override
    public final void a(ArrayList arrayList) {
        fga fgaVar = this.b;
        uk8 uk8Var = fgaVar.w;
        uic uicVar = fgaVar.b;
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
        int f = f(uicVar.getCurrentPosition());
        r5b r5bVar = fgaVar.c;
        r5bVar.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = r5bVar.h;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            w5b w5bVar = (w5b) obj2;
            hashMap.put(Integer.valueOf(w5bVar.a), w5bVar);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i < size3) {
            Object obj3 = arrayList2.get(i);
            i++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            w5b w5bVar2 = (w5b) hashMap.get(num2);
            if (w5bVar2 != null) {
                arrayList4.add(w5bVar2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f >= 0) {
            int i4 = i(f);
            uicVar.f(0.0f, i4, i4);
        }
        hl.r(uk8Var);
        hl.d3(uk8Var, 1000L);
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
        return ((w5b) this.b.c.h.get(i - 1)).a;
    }

    @Override
    public final CharSequence g(int i) {
        if (i == 0) {
            return ob6.M0(2131744443, null);
        }
        if (this.a && i == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) ob6.M0(2131744464, null));
            wm2 wm2Var = new wm2(2131232576, 0);
            wm2Var.H = 0.8f;
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((w5b) this.b.c.h.get(i - 1)).b;
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
