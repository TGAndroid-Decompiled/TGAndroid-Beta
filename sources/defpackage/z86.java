package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
public final class z86 implements s69, jcc {
    public final b58 a;

    public z86(b58 b58Var) {
        this.a = b58Var;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        long j;
        int i2;
        int i3;
        int i4;
        b58 b58Var = this.a;
        gu guVar = b58Var.c;
        ArrayList arrayList = b58Var.r;
        n96 n96Var = ((l96) view).f;
        int i5 = b58Var.O;
        int currentTime = ConnectionsManager.getInstance(i5).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            j = 0;
            if (i7 >= n96Var.f.size()) {
                break;
            }
            m96 m96Var = (m96) n96Var.f.get(i7);
            long j2 = m96Var.g;
            if (j2 > 0 && currentTime - m96Var.d <= eg5.b(i5, (int) j2, 0)) {
                hashSet.add(Integer.valueOf(m96Var.a));
            }
            i7++;
        }
        w96 w96Var = b58Var.Q;
        if (w96Var != null) {
            j = w96Var.m();
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i2 = -1;
            if (i8 < arrayList.size()) {
                m96 m96Var2 = (m96) arrayList.get(i8);
                if (m96Var2.b || !m96Var2.e || m96Var2.g >= j) {
                    if (!hashSet.contains(Integer.valueOf(m96Var2.a)) || (b58Var.x == n96Var.b && (i4 = b58Var.y) != 0 && m96Var2.a >= i4)) {
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
                m96 m96Var3 = (m96) arrayList.get(i6);
                if (m96Var3.b || !m96Var3.e || m96Var3.g >= j) {
                    if (hashSet.contains(Integer.valueOf(m96Var3.a))) {
                        i2 = m96Var3.a;
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
        b58Var.x = n96Var.b;
        b58Var.y = i2;
        b58Var.E = true;
        o79 itemAnimator = guVar.getItemAnimator();
        guVar.setItemAnimator(null);
        b58Var.d.h1(i9, guVar.getHeight() / 2, true);
        b58Var.e.g(i9);
        guVar.setItemAnimator(itemAnimator);
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Long l = (Long) num;
        return this.a.f((Long) obj);
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
