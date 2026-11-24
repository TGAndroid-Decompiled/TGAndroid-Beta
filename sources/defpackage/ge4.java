package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class ge4 extends fs5 {
    public final byte e = 0;
    public final Runnable f = new s54(this, (byte) 10);
    public final Object g;

    public ge4(FiltersSetupActivity filtersSetupActivity) {
        this.g = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s49 s49Var) {
        switch (this.e) {
            case 0:
                super.a(recyclerView, s49Var);
                View view = s49Var.a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296421, null);
                return;
            default:
                super.a(recyclerView, s49Var);
                View view2 = s49Var.a;
                view2.setPressed(false);
                view2.setTag(2131296421, null);
                if (view2 instanceof ff4) {
                    ((ff4) view2).setDragging(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final int f(RecyclerView recyclerView, s49 s49Var) {
        switch (this.e) {
            case 0:
                he4 he4Var = (he4) this.g;
                if (na7.q1(y6c.t0).E3() && (!he4Var.n || (s49Var.b() == 0 && ((de4) he4Var.h.get(0)).e && !y6c.h(y6c.t0).p()))) {
                    return fs5.m(0, 0);
                }
                return fs5.m(12, 0);
            default:
                if (s49Var.f != 2) {
                    return fs5.m(0, 0);
                }
                return fs5.m(3, 0);
        }
    }

    @Override
    public final boolean l() {
        switch (this.e) {
            case 0:
                return ((he4) this.g).n;
            default:
                return true;
        }
    }

    @Override
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        t97 t97Var;
        t97 t97Var2;
        byte b = this.e;
        Object obj = this.g;
        int i = 0;
        switch (b) {
            case 0:
                if (na7.q1(y6c.t0).E3() && ((s49Var.b() == 0 || s49Var2.b() == 0) && !y6c.h(y6c.t0).p())) {
                    return false;
                }
                s20 s20Var = ((he4) obj).J;
                int b2 = s49Var.b();
                int b3 = s49Var2.b();
                he4 he4Var = (he4) s20Var.e;
                ArrayList arrayList = he4Var.h;
                SparseIntArray sparseIntArray = he4Var.l0;
                int size = arrayList.size();
                if (b2 >= 0 && b3 >= 0 && b2 < size && b3 < size) {
                    ArrayList R0 = na7.q1(y6c.t0).R0();
                    t97 t97Var3 = (t97) R0.get(b2);
                    t97 t97Var4 = (t97) R0.get(b3);
                    int i2 = t97Var3.f;
                    t97Var3.f = t97Var4.f;
                    t97Var4.f = i2;
                    R0.set(b2, t97Var4);
                    R0.set(b3, t97Var3);
                    de4 de4Var = (de4) arrayList.get(b2);
                    de4 de4Var2 = (de4) arrayList.get(b3);
                    int i3 = de4Var.a;
                    de4Var.a = de4Var2.a;
                    de4Var2.a = i3;
                    int i4 = sparseIntArray.get(b2);
                    sparseIntArray.put(b2, sparseIntArray.get(b3));
                    sparseIntArray.put(b3, i4);
                    ce4 ce4Var = he4Var.K;
                    int i5 = de4Var2.a;
                    int i6 = de4Var.a;
                    ti3 ti3Var = (ti3) ce4Var;
                    while (true) {
                        bj3[] bj3VarArr = ti3Var.b.f0;
                        if (i < bj3VarArr.length) {
                            bj3 bj3Var = bj3VarArr[i];
                            int i7 = bj3Var.h;
                            if (i7 == i5) {
                                bj3Var.h = i6;
                            } else if (i7 == i6) {
                                bj3Var.h = i5;
                            }
                            i++;
                        } else {
                            int i8 = he4Var.L;
                            if (i8 == b2) {
                                he4Var.L = b3;
                                he4Var.M = de4Var.a;
                            } else if (i8 == b3) {
                                he4Var.L = b2;
                                he4Var.M = de4Var2.a;
                            }
                            int i9 = he4Var.r0;
                            if (i9 == b2) {
                                he4Var.r0 = b3;
                                he4Var.s0 = de4Var.a;
                            } else if (i9 == b3) {
                                he4Var.r0 = b2;
                                he4Var.s0 = de4Var2.a;
                            }
                            arrayList.set(b2, de4Var2);
                            arrayList.set(b3, de4Var);
                            he4Var.m();
                            he4Var.E = true;
                            he4Var.G.setItemAnimator(he4Var.t0);
                            s20Var.j(b2, b3);
                        }
                    }
                }
                return true;
            default:
                if (s49Var.f != s49Var2.f) {
                    return false;
                }
                kf4 kf4Var = ((FiltersSetupActivity) obj).b;
                int b4 = s49Var.b();
                int b5 = s49Var2.b();
                FiltersSetupActivity filtersSetupActivity = kf4Var.e;
                int i10 = filtersSetupActivity.r;
                ArrayList arrayList2 = filtersSetupActivity.n;
                if (b4 >= i10 && b5 >= i10) {
                    hf4 hf4Var = (hf4) arrayList2.get(b4);
                    hf4 hf4Var2 = (hf4) arrayList2.get(b5);
                    if (hf4Var != null && hf4Var2 != null && (t97Var = hf4Var.d) != null && (t97Var2 = hf4Var2.d) != null) {
                        int i11 = t97Var.f;
                        t97Var.f = t97Var2.f;
                        t97Var2.f = i11;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().G0;
                        try {
                            arrayList3.set(b4 - filtersSetupActivity.r, hf4Var2.d);
                            arrayList3.set(b5 - filtersSetupActivity.r, hf4Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.e = true;
                        filtersSetupActivity.f0(true);
                    }
                }
                return true;
        }
    }

    @Override
    public final void q(s49 s49Var, int i) {
        byte b = this.e;
        Boolean bool = null;
        Object obj = this.g;
        boolean z = false;
        Runnable runnable = this.f;
        switch (b) {
            case 0:
                s54 s54Var = (s54) runnable;
                he4 he4Var = (he4) obj;
                if (i != 0) {
                    he4Var.G.J0(false);
                    s49Var.a.setPressed(true);
                    zkb.h(he4Var.c0, he4Var.a, s49Var.a);
                } else {
                    gl.r(s54Var);
                    gl.e3(s54Var, 320L);
                }
                if (s49Var != null) {
                    View view = s49Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296421, bool);
                    return;
                }
                return;
            default:
                s54 s54Var2 = (s54) runnable;
                if (i != 0) {
                    ((FiltersSetupActivity) obj).a.J0(false);
                    s49Var.a.setPressed(true);
                } else {
                    gl.r(s54Var2);
                    gl.e3(s54Var2, 320L);
                }
                if (s49Var != null) {
                    View view2 = s49Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296421, bool);
                    if (view2 instanceof ff4) {
                        ff4 ff4Var = (ff4) view2;
                        if (i == 2) {
                            z = true;
                        }
                        ff4Var.setDragging(z);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void r(s49 s49Var) {
        byte b = this.e;
    }

    public ge4(he4 he4Var) {
        this.g = he4Var;
    }

    private final void u(s49 s49Var) {
    }

    private final void v(s49 s49Var) {
    }
}
