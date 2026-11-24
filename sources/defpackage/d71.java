package defpackage;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.d;
public final class d71 implements g94, gx5, ee, bja, g59 {
    public final byte a;
    public final y71 b;

    public d71(y71 y71Var, byte b) {
        this.a = b;
        this.b = y71Var;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        byte b = this.a;
        y71 y71Var = this.b;
        switch (b) {
            case 0:
                y71Var.z0();
                y71Var.fragmentView.invalidate();
                return;
            default:
                y71Var.s0(f);
                return;
        }
    }

    @Override
    public final void V(float f, int i) {
        byte b = this.a;
    }

    @Override
    public final void a(int i) {
        gm.V3(this.b.b);
    }

    @Override
    public final int b() {
        return this.b.S;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        hd0 hd0Var;
        y71 y71Var = this.b;
        ArrayList arrayList = y71Var.g0;
        if (y71Var.getParentActivity() != null && i >= 0 && i < arrayList.size()) {
            u71 u71Var = (u71) arrayList.get(i);
            int i2 = 0;
            if (u71Var.a == 11 && (view instanceof oh2)) {
                int i3 = u71Var.f;
                if (i3 < 0) {
                    y71Var.M = !y71Var.M;
                    y71Var.A0(true);
                    y71Var.y0();
                    return;
                }
                boolean[] zArr = y71Var.d;
                if (i3 < 0) {
                    y71Var.w0(view);
                    return;
                }
                if (zArr[i3]) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < 10; i5++) {
                        if (zArr[i5] && y71Var.v0(i5) > 0) {
                            i4++;
                        }
                    }
                    if (i4 <= 1) {
                        xx0.APP_ERROR.a();
                        gm.A3(-3.0f, view, null);
                        return;
                    }
                }
                int i6 = u71Var.f;
                boolean z = !zArr[i6];
                zArr[i6] = z;
                ((oh2) view).c(z, true);
                if (u71Var.i) {
                    while (true) {
                        if (i2 >= y71Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = y71Var.b.getChildAt(i2);
                        if (childAt instanceof oh2) {
                            y71Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u71) arrayList.get(R)).f < 0) {
                                ((oh2) childAt).c(y71Var.o0(), true);
                                break;
                            }
                        }
                        i2++;
                    }
                }
                y71Var.y0();
            } else if (u71Var.c >= 0) {
                jx5 jx5Var = new jx5(y71Var, view.getContext());
                m8 N = ik.N(y71Var, jx5Var, view, f, f2);
                int i7 = ((u71) arrayList.get(i)).c;
                jx5Var.d0 = i7;
                FrameLayout frameLayout = jx5Var.i0;
                a8 a8Var = jx5Var.W;
                l66 l66Var = jx5Var.U;
                ix5 ix5Var = jx5Var.c0;
                a8 a8Var2 = jx5Var.a0;
                if (i7 == 3) {
                    a8Var2.setVisibility(0);
                    a8Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    ix5Var.setVisibility(8);
                    l66Var.setVisibility(8);
                } else {
                    a8Var2.setVisibility(8);
                    a8Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    ix5Var.setVisibility(0);
                    l66Var.setVisibility(0);
                }
                ArrayList d = jx5Var.e0.d(i7);
                jx5Var.g0 = d;
                boolean isEmpty = d.isEmpty();
                d dVar = jx5Var.h0;
                if (isEmpty) {
                    lka lkaVar = ix5Var.a;
                    hd0 hd0Var2 = ix5Var.b;
                    lkaVar.l(jb6.M0(2131754472, null), false);
                    ix5Var.a.setRightPadding(gm.L(8.0f));
                    hd0Var2.b(0, dVar.getCurrentAccount(), null);
                    hd0Var2.b(1, dVar.getCurrentAccount(), null);
                    hd0Var2.b(2, dVar.getCurrentAccount(), null);
                    hd0Var2.a(false);
                } else {
                    int min = Math.min(3, jx5Var.g0.size());
                    ix5Var.a.setRightPadding(gm.L((Math.max(0, min - 1) * 12) + 64));
                    ix5Var.a.l(jb6.G(jx5Var.g0.size(), "ExceptionShort", Integer.valueOf(jx5Var.g0.size())), false);
                    int i8 = 0;
                    while (true) {
                        hd0Var = ix5Var.b;
                        if (i8 >= min) {
                            break;
                        }
                        hd0Var.b(i8, dVar.getCurrentAccount(), dVar.getMessagesController().a2(((t61) jx5Var.g0.get(i8)).a));
                        i8++;
                    }
                    hd0Var.a(false);
                }
                jx5Var.V.setVisibility(8);
                l66Var.setVisibility(8);
                jx5Var.g();
                jx5Var.setParentWindow(N);
                jx5Var.setCallback(new d71(y71Var, (byte) 1));
            }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        y71 y71Var = this.b;
        c81 c81Var = y71Var.e0;
        LongSparseArray longSparseArray = c81Var.c;
        s71 s71Var = new s71(0L);
        Iterator it = c81Var.j.iterator();
        while (it.hasNext()) {
            b81 b81Var = (b81) it.next();
            s71Var.a(b81Var, b81Var.d);
            s71 s71Var2 = (s71) longSparseArray.get(b81Var.b);
            if (s71Var2 != null) {
                s71Var2.b(b81Var);
                if (s71Var2.c <= 0) {
                    longSparseArray.remove(b81Var.b);
                    c81Var.b.remove(s71Var2);
                }
                ArrayList e = c81Var.e(b81Var.d);
                if (e != null) {
                    e.remove(b81Var);
                }
            }
        }
        if (s71Var.c > 0) {
            y71Var.f0(s71Var, null, null);
        }
        y71Var.e0.d();
        k71 k71Var = y71Var.N;
        if (k71Var != null) {
            k71Var.d();
            y71Var.N.f(false);
        }
        y71Var.A0(true);
        y71Var.y0();
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    private final void c(float f, int i) {
    }

    private final void e(float f, int i) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
