package defpackage;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.d;
public final class w51 implements x74, gv5, ed, zga, d39 {
    public final byte a;
    public final r61 b;

    public w51(r61 r61Var, byte b) {
        this.a = b;
        this.b = r61Var;
    }

    @Override
    public final void F(float f, int i) {
        byte b = this.a;
    }

    @Override
    public final void a(int i) {
        gl.V3(this.b.b);
    }

    @Override
    public final int b() {
        return this.b.S;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        hc0 hc0Var;
        r61 r61Var = this.b;
        ArrayList arrayList = r61Var.g0;
        if (r61Var.getParentActivity() != null && i >= 0 && i < arrayList.size()) {
            n61 n61Var = (n61) arrayList.get(i);
            int i2 = 0;
            if (n61Var.a == 11 && (view instanceof ag2)) {
                int i3 = n61Var.f;
                if (i3 < 0) {
                    r61Var.M = !r61Var.M;
                    r61Var.z0(true);
                    r61Var.x0();
                    return;
                }
                boolean[] zArr = r61Var.d;
                if (i3 < 0) {
                    r61Var.v0(view);
                    return;
                }
                if (zArr[i3]) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < 10; i5++) {
                        if (zArr[i5] && r61Var.u0(i5) > 0) {
                            i4++;
                        }
                    }
                    if (i4 <= 1) {
                        pw0.APP_ERROR.a();
                        gl.A3(-3.0f, view, null);
                        return;
                    }
                }
                int i6 = n61Var.f;
                boolean z = !zArr[i6];
                zArr[i6] = z;
                ((ag2) view).c(z, true);
                if (n61Var.i) {
                    while (true) {
                        if (i2 >= r61Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = r61Var.b.getChildAt(i2);
                        if (childAt instanceof ag2) {
                            r61Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((n61) arrayList.get(R)).f < 0) {
                                ((ag2) childAt).c(r61Var.n0(), true);
                                break;
                            }
                        }
                        i2++;
                    }
                }
                r61Var.x0();
            } else if (n61Var.c >= 0) {
                jv5 jv5Var = new jv5(r61Var, view.getContext());
                m8 N = ij.N(r61Var, jv5Var, view, f, f2);
                int i7 = ((n61) arrayList.get(i)).c;
                jv5Var.d0 = i7;
                FrameLayout frameLayout = jv5Var.i0;
                a8 a8Var = jv5Var.W;
                l46 l46Var = jv5Var.U;
                iv5 iv5Var = jv5Var.c0;
                a8 a8Var2 = jv5Var.a0;
                if (i7 == 3) {
                    a8Var2.setVisibility(0);
                    a8Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    iv5Var.setVisibility(8);
                    l46Var.setVisibility(8);
                } else {
                    a8Var2.setVisibility(8);
                    a8Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    iv5Var.setVisibility(0);
                    l46Var.setVisibility(0);
                }
                ArrayList d = jv5Var.e0.d(i7);
                jv5Var.g0 = d;
                boolean isEmpty = d.isEmpty();
                d dVar = jv5Var.h0;
                if (isEmpty) {
                    jia jiaVar = iv5Var.a;
                    hc0 hc0Var2 = iv5Var.b;
                    jiaVar.l(k96.M0(2131754472, null), false);
                    iv5Var.a.setRightPadding(gl.L(8.0f));
                    hc0Var2.b(0, dVar.getCurrentAccount(), null);
                    hc0Var2.b(1, dVar.getCurrentAccount(), null);
                    hc0Var2.b(2, dVar.getCurrentAccount(), null);
                    hc0Var2.a(false);
                } else {
                    int min = Math.min(3, jv5Var.g0.size());
                    iv5Var.a.setRightPadding(gl.L((Math.max(0, min - 1) * 12) + 64));
                    iv5Var.a.l(k96.G(jv5Var.g0.size(), "ExceptionShort", Integer.valueOf(jv5Var.g0.size())), false);
                    int i8 = 0;
                    while (true) {
                        hc0Var = iv5Var.b;
                        if (i8 >= min) {
                            break;
                        }
                        hc0Var.b(i8, dVar.getCurrentAccount(), dVar.getMessagesController().Z1(((m51) jv5Var.g0.get(i8)).a));
                        i8++;
                    }
                    hc0Var.a(false);
                }
                jv5Var.V.setVisibility(8);
                l46Var.setVisibility(8);
                jv5Var.g();
                jv5Var.setParentWindow(N);
                jv5Var.setCallback(new w51(r61Var, (byte) 1));
            }
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        byte b = this.a;
        r61 r61Var = this.b;
        switch (b) {
            case 0:
                r61Var.y0();
                r61Var.fragmentView.invalidate();
                return;
            default:
                r61Var.r0(f);
                return;
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        r61 r61Var = this.b;
        v61 v61Var = r61Var.e0;
        LongSparseArray longSparseArray = v61Var.c;
        l61 l61Var = new l61(0L);
        Iterator it = v61Var.j.iterator();
        while (it.hasNext()) {
            u61 u61Var = (u61) it.next();
            l61Var.a(u61Var, u61Var.d);
            l61 l61Var2 = (l61) longSparseArray.get(u61Var.b);
            if (l61Var2 != null) {
                l61Var2.b(u61Var);
                if (l61Var2.c <= 0) {
                    longSparseArray.remove(u61Var.b);
                    v61Var.b.remove(l61Var2);
                }
                ArrayList e = v61Var.e(u61Var.d);
                if (e != null) {
                    e.remove(u61Var);
                }
            }
        }
        if (l61Var.c > 0) {
            r61Var.e0(l61Var, null, null);
        }
        r61Var.e0.d();
        d61 d61Var = r61Var.N;
        if (d61Var != null) {
            d61Var.d();
            r61Var.N.f(false);
        }
        r61Var.z0(true);
        r61Var.x0();
    }

    private final void c(float f, int i) {
    }

    private final void d(float f, int i) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
