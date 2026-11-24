package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
public final class v66 implements j8c, d39 {
    public final l18 a;

    public v66(l18 l18Var) {
        this.a = l18Var;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        long j;
        int i2;
        int i3;
        int i4;
        l18 l18Var = this.a;
        fu fuVar = l18Var.c;
        ArrayList arrayList = l18Var.r;
        j76 j76Var = ((h76) view).f;
        int i5 = l18Var.O;
        int currentTime = ConnectionsManager.getInstance(i5).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            j = 0;
            if (i7 >= j76Var.f.size()) {
                break;
            }
            i76 i76Var = (i76) j76Var.f.get(i7);
            long j2 = i76Var.g;
            if (j2 > 0 && currentTime - i76Var.d <= de5.b(i5, (int) j2, 0)) {
                hashSet.add(Integer.valueOf(i76Var.a));
            }
            i7++;
        }
        t76 t76Var = l18Var.Q;
        if (t76Var != null) {
            j = t76Var.m();
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i2 = -1;
            if (i8 < arrayList.size()) {
                i76 i76Var2 = (i76) arrayList.get(i8);
                if (i76Var2.b || !i76Var2.e || i76Var2.g >= j) {
                    if (!hashSet.contains(Integer.valueOf(i76Var2.a)) || (l18Var.x == j76Var.b && (i4 = l18Var.y) != 0 && i76Var2.a >= i4)) {
                        i9++;
                    }
                }
                i8++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 < 0) {
            int i10 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                i76 i76Var3 = (i76) arrayList.get(i6);
                if (i76Var3.b || !i76Var3.e || i76Var3.g >= j) {
                    if (hashSet.contains(Integer.valueOf(i76Var3.a))) {
                        i2 = i76Var3.a;
                        break;
                    }
                    i10++;
                }
                i6++;
            }
            i9 = i10;
        } else {
            i2 = i3;
        }
        if (i2 < 0) {
            return;
        }
        l18Var.x = j76Var.b;
        l18Var.y = i2;
        l18Var.E = true;
        b49 itemAnimator = fuVar.getItemAnimator();
        fuVar.setItemAnimator(null);
        l18Var.d.h1(i9, fuVar.getHeight() / 2, true);
        l18Var.e.g(i9);
        fuVar.setItemAnimator(itemAnimator);
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Long l = (Long) num;
        return this.a.f((Long) obj);
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
