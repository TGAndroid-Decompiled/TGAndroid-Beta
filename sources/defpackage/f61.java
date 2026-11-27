package defpackage;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.e;
public final class f61 implements fd, lx5, ska, s69, s84 {
    public final byte a;
    public final z61 b;

    public f61(z61 z61Var, byte b) {
        this.a = b;
        this.b = z61Var;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void a(int i) {
        hl.V3(this.b.b);
    }

    @Override
    public final int c() {
        return this.b.S;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        jc0 jc0Var;
        z61 z61Var = this.b;
        ArrayList arrayList = z61Var.g0;
        if (z61Var.getParentActivity() != null && i >= 0 && i < arrayList.size()) {
            v61 v61Var = (v61) arrayList.get(i);
            int i2 = 0;
            if (v61Var.a == 11 && (view instanceof sg2)) {
                int i3 = v61Var.f;
                if (i3 < 0) {
                    z61Var.M = !z61Var.M;
                    z61Var.A0(true);
                    z61Var.y0();
                    return;
                }
                boolean[] zArr = z61Var.d;
                if (i3 < 0) {
                    z61Var.w0(view);
                    return;
                }
                if (zArr[i3]) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < 10; i5++) {
                        if (zArr[i5] && z61Var.u0(i5) > 0) {
                            i4++;
                        }
                    }
                    if (i4 <= 1) {
                        yw0.APP_ERROR.a();
                        hl.A3(-3.0f, view, null);
                        return;
                    }
                }
                int i6 = v61Var.f;
                boolean z = !zArr[i6];
                zArr[i6] = z;
                ((sg2) view).c(z, true);
                if (v61Var.i) {
                    while (true) {
                        if (i2 >= z61Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = z61Var.b.getChildAt(i2);
                        if (childAt instanceof sg2) {
                            z61Var.b.getClass();
                            int S = RecyclerView.S(childAt);
                            if (S >= 0 && S < arrayList.size() && ((v61) arrayList.get(S)).f < 0) {
                                ((sg2) childAt).c(z61Var.n0(), true);
                                break;
                            }
                        }
                        i2++;
                    }
                }
                z61Var.y0();
            } else if (v61Var.c >= 0) {
                ox5 ox5Var = new ox5(z61Var, view.getContext());
                n8 N = jj.N(z61Var, ox5Var, view, f, f2);
                int i7 = ((v61) arrayList.get(i)).c;
                ox5Var.d0 = i7;
                FrameLayout frameLayout = ox5Var.i0;
                b8 b8Var = ox5Var.W;
                p66 p66Var = ox5Var.U;
                nx5 nx5Var = ox5Var.c0;
                b8 b8Var2 = ox5Var.a0;
                if (i7 == 3) {
                    b8Var2.setVisibility(0);
                    b8Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    nx5Var.setVisibility(8);
                    p66Var.setVisibility(8);
                } else {
                    b8Var2.setVisibility(8);
                    b8Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    nx5Var.setVisibility(0);
                    p66Var.setVisibility(0);
                }
                ArrayList d = ox5Var.e0.d(i7);
                ox5Var.g0 = d;
                boolean isEmpty = d.isEmpty();
                e eVar = ox5Var.h0;
                if (isEmpty) {
                    ema emaVar = nx5Var.a;
                    jc0 jc0Var2 = nx5Var.b;
                    emaVar.l(ob6.M0(2131754468, null), false);
                    nx5Var.a.setRightPadding(hl.L(8.0f));
                    jc0Var2.b(0, eVar.getCurrentAccount(), null);
                    jc0Var2.b(1, eVar.getCurrentAccount(), null);
                    jc0Var2.b(2, eVar.getCurrentAccount(), null);
                    jc0Var2.a(false);
                } else {
                    int min = Math.min(3, ox5Var.g0.size());
                    nx5Var.a.setRightPadding(hl.L((Math.max(0, min - 1) * 12) + 64));
                    nx5Var.a.l(ob6.G(ox5Var.g0.size(), "ExceptionShort", Integer.valueOf(ox5Var.g0.size())), false);
                    int i8 = 0;
                    while (true) {
                        jc0Var = nx5Var.b;
                        if (i8 >= min) {
                            break;
                        }
                        jc0Var.b(i8, eVar.getCurrentAccount(), eVar.getMessagesController().b2(((u51) ox5Var.g0.get(i8)).a));
                        i8++;
                    }
                    jc0Var.a(false);
                }
                ox5Var.V.setVisibility(8);
                p66Var.setVisibility(8);
                ox5Var.g();
                ox5Var.setParentWindow(N);
                ox5Var.setCallback(new f61(z61Var, (byte) 1));
            }
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        byte b = this.a;
        z61 z61Var = this.b;
        switch (b) {
            case 4:
                z61Var.r0(f);
                return;
            default:
                z61Var.z0();
                z61Var.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public final void v0(float f, int i) {
        byte b = this.a;
    }

    @Override
    public final void w(id idVar, int i) {
        z61 z61Var = this.b;
        d71 d71Var = z61Var.e0;
        LongSparseArray longSparseArray = d71Var.c;
        t61 t61Var = new t61(0L);
        Iterator it = d71Var.j.iterator();
        while (it.hasNext()) {
            c71 c71Var = (c71) it.next();
            t61Var.a(c71Var, c71Var.d);
            t61 t61Var2 = (t61) longSparseArray.get(c71Var.b);
            if (t61Var2 != null) {
                t61Var2.b(c71Var);
                if (t61Var2.c <= 0) {
                    longSparseArray.remove(c71Var.b);
                    d71Var.b.remove(t61Var2);
                }
                ArrayList e = d71Var.e(c71Var.d);
                if (e != null) {
                    e.remove(c71Var);
                }
            }
        }
        if (t61Var.c > 0) {
            z61Var.e0(t61Var, null, null);
        }
        z61Var.e0.d();
        l61 l61Var = z61Var.N;
        if (l61Var != null) {
            l61Var.d();
            z61Var.N.f(false);
        }
        z61Var.A0(true);
        z61Var.y0();
    }

    private final void b(float f, int i) {
    }

    private final void e(float f, int i) {
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
