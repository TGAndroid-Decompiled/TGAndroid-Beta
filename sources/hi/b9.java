package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.mv0;
public final class b9 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.i6 f14235e;
    public final y8 f14236f;
    public ek0 h;
    public final f9 f14237n;

    public b9(f9 f9Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, y8 y8Var, fi.o3 o3Var) {
        this.f14237n = f9Var;
        this.d = context;
        this.f14235e = i6Var;
        this.f14236f = y8Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if ((i7 != 3 || !this.f14237n.f14495a0.A1) && i7 != 7 && i7 != 9 && i7 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f14237n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        f9 f9Var = this.f14237n;
        ArrayList arrayList = f9Var.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            return ((t8) f9Var.M.get(i7)).f56712a;
        }
        return -1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        t8 t8Var;
        boolean z10;
        int i10;
        int i11;
        int i12;
        f9 f9Var = this.f14237n;
        k9 k9Var = f9Var.f14495a0;
        ArrayList arrayList = f9Var.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            t8 t8Var2 = (t8) arrayList.get(i7);
            int i13 = f1Var.f59249f;
            View view = f1Var.f59245a;
            boolean z11 = true;
            int i14 = i7 + 1;
            if (i14 < arrayList.size()) {
                t8Var = (t8) arrayList.get(i14);
            } else {
                t8Var = null;
            }
            if (t8Var != null && ((i12 = t8Var.f56712a) == i13 || (i12 == 9 && t8Var.f15455q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i13 == 3) {
                j9 j9Var = (j9) view;
                boolean z12 = t8Var2.f15452n;
                j9Var.d(z12, !z12);
                int i15 = t8Var2.f15447i;
                float f10 = 1.0f;
                if (i15 > 0) {
                    j9Var.e(i15, t8Var2.f15448j, t8Var2.f15446g);
                    j9Var.b(false, 1.0f);
                } else {
                    TLRPC.User user = t8Var2.f15446g;
                    if (user != null) {
                        j9Var.setUser(user);
                        if (t8Var2.f15450l && !t8Var2.f15449k) {
                            f10 = 0.5f;
                        }
                        j9Var.b(false, f10);
                    } else {
                        TLRPC.Chat chat = t8Var2.h;
                        if (chat != null) {
                            j9Var.a(k9.L0(k9Var, chat), chat);
                        }
                    }
                }
                if (!t8Var2.f15449k && !t8Var2.f15450l) {
                    z11 = false;
                }
                j9Var.c(z11, false);
                j9Var.setDivider(z10);
                j9Var.setRedCheckbox(t8Var2.f15451m);
                j9Var.f14752w = k9Var.A1;
            } else if (i13 != 2) {
                if (i13 == 0) {
                    view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                } else if (i13 == -1) {
                    if (t8Var2.f15453o > 0) {
                        ek0 ek0Var = this.h;
                        if (ek0Var != null && ek0Var.getMeasuredHeight() > 0) {
                            i11 = this.h.getMeasuredHeight() + f9Var.U;
                        } else {
                            i11 = org.telegram.messenger.g0.f24226q.y;
                        }
                        i10 = Math.max(i11 - t8Var2.f15453o, org.telegram.messenger.g0.L(120.0f));
                        view.setTag(33);
                    } else {
                        i10 = t8Var2.f15454p;
                        if (i10 >= 0) {
                            view.setTag(null);
                        } else {
                            i10 = (int) (org.telegram.messenger.g0.f24226q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new v4.q0(-1, i10));
                } else if (i13 == 1) {
                    view.setLayoutParams(new v4.q0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f14236f.L)));
                } else if (i13 == 4) {
                    r8 r8Var = (r8) view;
                    CharSequence charSequence = t8Var2.f15444e;
                    CharSequence charSequence2 = t8Var2.f15445f;
                    r8Var.f15321a.setText(charSequence);
                    r8Var.f15322b.setText(charSequence2);
                } else if (i13 == 11) {
                    r8 r8Var2 = (r8) view;
                    r8Var2.f15321a.setText(t8Var2.f15444e);
                    r8Var2.f15322b.setText((CharSequence) null);
                } else if (i13 == 5) {
                    try {
                        ((mv0) view).f37551b.getImageReceiver().Q0(false);
                    } catch (Exception unused) {
                    }
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    if (t8Var2.f15444e == null) {
                        z8Var.setFixedSize(12);
                        z8Var.setText(null);
                        return;
                    }
                    z8Var.setFixedSize(0);
                    z8Var.setText(t8Var2.f15444e);
                } else if (i13 == 7) {
                    int i16 = t8Var2.f15443c;
                    if (i16 == 0) {
                        ((org.telegram.ui.Cells.m8) view).l(t8Var2.f15444e, k9Var.f14797x1, z10);
                    } else if (i16 == 1) {
                        ((org.telegram.ui.Cells.m8) view).l(t8Var2.f15444e, k9Var.f14798y1, z10);
                    } else if (i16 == 2) {
                        ((org.telegram.ui.Cells.m8) view).l(t8Var2.f15444e, k9Var.f14796w1, z10);
                    }
                } else if (i13 == 9) {
                    Drawable drawable = t8Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.m8) view).v(t8Var2.f15444e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.m8) view).q(t8Var2.f15444e, t8Var2.f15445f, false, z10);
                    }
                } else if (i13 == 8) {
                    ((org.telegram.ui.Cells.o4) view).setText(t8Var2.f15444e);
                } else if (i13 == 10) {
                    int i17 = k9.Y1;
                    int i18 = (int) mp.u1(k9Var.f30223a).L6;
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
                    int j3 = Utilities.j(k9Var.C1, i18, 0);
                    g0.f fVar = new g0.f(29);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.f31865c = a10;
                    s7Var.d = 20;
                    s7Var.f31866e = fVar;
                    ((org.telegram.ui.Cells.t7) view).d(j3, s7Var, new c7(this, 2));
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View t7Var;
        org.telegram.ui.Cells.m8 m8Var;
        mv0 mv0Var;
        Context context = this.d;
        if (i7 == -1) {
            t7Var = new View(context);
        } else if (i7 == 0) {
            t7Var = new View(context);
            t7Var.setTag(35);
        } else if (i7 == 1) {
            t7Var = new View(context);
            t7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.f14235e;
            if (i7 == 3) {
                t7Var = new j9(context, i6Var);
            } else {
                if (i7 == 4) {
                    mv0Var = new r8(context, i6Var, true);
                } else if (i7 == 11) {
                    t7Var = new r8(context, i6Var, false);
                } else if (i7 == 8) {
                    t7Var = new org.telegram.ui.Cells.o4(context, i6Var);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, t7Var, i6Var);
                } else if (i7 == 5) {
                    mv0 mv0Var2 = new mv0(context, null, 1, i6Var);
                    mv0Var2.d.setText(gd.N0(2131747974, null));
                    mv0Var2.f37553e.setText(gd.N0(2131745611, null));
                    mv0Var2.f37550a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    mv0Var = mv0Var2;
                } else if (i7 == 6) {
                    t7Var = new org.telegram.ui.Cells.z8(context, i6Var);
                    t7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.f14235e, true, true);
                    } else if (i7 == 9) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.f14235e, true, false);
                    } else if (i7 == 10) {
                        t7Var = new org.telegram.ui.Cells.t7(context, i6Var);
                    } else {
                        mv0Var = new in(context, 1);
                    }
                    t7Var = m8Var;
                }
                t7Var = mv0Var;
            }
        }
        return new v4.f1(t7Var);
    }
}
