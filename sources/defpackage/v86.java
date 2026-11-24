package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
public final class v86 implements kac, g59 {
    public final n38 a;

    public v86(n38 n38Var) {
        this.a = n38Var;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        long j;
        int i2;
        int i3;
        int i4;
        n38 n38Var = this.a;
        fv fvVar = n38Var.c;
        ArrayList arrayList = n38Var.r;
        j96 j96Var = ((h96) view).f;
        int i5 = n38Var.O;
        int currentTime = ConnectionsManager.getInstance(i5).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            j = 0;
            if (i7 >= j96Var.f.size()) {
                break;
            }
            i96 i96Var = (i96) j96Var.f.get(i7);
            long j2 = i96Var.g;
            if (j2 > 0 && currentTime - i96Var.d <= bg5.b(i5, (int) j2, 0)) {
                hashSet.add(Integer.valueOf(i96Var.a));
            }
            i7++;
        }
        s96 s96Var = n38Var.Q;
        if (s96Var != null) {
            j = s96Var.m();
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i2 = -1;
            if (i8 < arrayList.size()) {
                i96 i96Var2 = (i96) arrayList.get(i8);
                if (i96Var2.b || !i96Var2.e || i96Var2.g >= j) {
                    if (!hashSet.contains(Integer.valueOf(i96Var2.a)) || (n38Var.x == j96Var.b && (i4 = n38Var.y) != 0 && i96Var2.a >= i4)) {
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
                i96 i96Var3 = (i96) arrayList.get(i6);
                if (i96Var3.b || !i96Var3.e || i96Var3.g >= j) {
                    if (hashSet.contains(Integer.valueOf(i96Var3.a))) {
                        i2 = i96Var3.a;
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
        n38Var.x = j96Var.b;
        n38Var.y = i2;
        n38Var.E = true;
        d69 itemAnimator = fvVar.getItemAnimator();
        fvVar.setItemAnimator(null);
        n38Var.d.h1(i9, fvVar.getHeight() / 2, true);
        n38Var.e.g(i9);
        fvVar.setItemAnimator(itemAnimator);
    }

    @Override
    public final Object j(Integer num, Object obj) {
        Long l = (Long) num;
        return this.a.f((Long) obj);
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
