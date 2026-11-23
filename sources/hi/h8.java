package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.nv0;
public final class h8 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.h6 f14690e;
    public final e8 f14691f;
    public ek0 h;
    public final l8 f14692n;

    public h8(l8 l8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, e8 e8Var, fi.o3 o3Var) {
        this.f14692n = l8Var;
        this.d = context;
        this.f14690e = h6Var;
        this.f14691f = e8Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if ((i7 != 3 || !this.f14692n.f14942a0.A1) && i7 != 7 && i7 != 9 && i7 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f14692n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        l8 l8Var = this.f14692n;
        ArrayList arrayList = l8Var.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            return ((z7) l8Var.M.get(i7)).f56599a;
        }
        return -1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        z7 z7Var;
        boolean z10;
        int i10;
        int i11;
        int i12;
        l8 l8Var = this.f14692n;
        q8 q8Var = l8Var.f14942a0;
        ArrayList arrayList = l8Var.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            z7 z7Var2 = (z7) arrayList.get(i7);
            int i13 = e1Var.f59115f;
            View view = e1Var.f59111a;
            boolean z11 = true;
            int i14 = i7 + 1;
            if (i14 < arrayList.size()) {
                z7Var = (z7) arrayList.get(i14);
            } else {
                z7Var = null;
            }
            if (z7Var != null && ((i12 = z7Var.f56599a) == i13 || (i12 == 9 && z7Var.f15825q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i13 == 3) {
                p8 p8Var = (p8) view;
                boolean z12 = z7Var2.f15822n;
                p8Var.d(z12, !z12);
                int i15 = z7Var2.f15817i;
                float f10 = 1.0f;
                if (i15 > 0) {
                    p8Var.e(i15, z7Var2.f15818j, z7Var2.f15816g);
                    p8Var.b(false, 1.0f);
                } else {
                    TLRPC.User user = z7Var2.f15816g;
                    if (user != null) {
                        p8Var.setUser(user);
                        if (z7Var2.f15820l && !z7Var2.f15819k) {
                            f10 = 0.5f;
                        }
                        p8Var.b(false, f10);
                    } else {
                        TLRPC.Chat chat = z7Var2.h;
                        if (chat != null) {
                            p8Var.a(q8.L0(q8Var, chat), chat);
                        }
                    }
                }
                if (!z7Var2.f15819k && !z7Var2.f15820l) {
                    z11 = false;
                }
                p8Var.c(z11, false);
                p8Var.setDivider(z10);
                p8Var.setRedCheckbox(z7Var2.f15821m);
                p8Var.f15196w = q8Var.A1;
            } else if (i13 != 2) {
                if (i13 == 0) {
                    view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                } else if (i13 == -1) {
                    if (z7Var2.f15823o > 0) {
                        ek0 ek0Var = this.h;
                        if (ek0Var != null && ek0Var.getMeasuredHeight() > 0) {
                            i11 = this.h.getMeasuredHeight() + l8Var.U;
                        } else {
                            i11 = org.telegram.messenger.g0.f24010q.y;
                        }
                        i10 = Math.max(i11 - z7Var2.f15823o, org.telegram.messenger.g0.L(120.0f));
                        view.setTag(33);
                    } else {
                        i10 = z7Var2.f15824p;
                        if (i10 >= 0) {
                            view.setTag(null);
                        } else {
                            i10 = (int) (org.telegram.messenger.g0.f24010q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new v4.p0(-1, i10));
                } else if (i13 == 1) {
                    view.setLayoutParams(new v4.p0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f14691f.L)));
                } else if (i13 == 4) {
                    x7 x7Var = (x7) view;
                    CharSequence charSequence = z7Var2.f15814e;
                    CharSequence charSequence2 = z7Var2.f15815f;
                    x7Var.f15694a.setText(charSequence);
                    x7Var.f15695b.setText(charSequence2);
                } else if (i13 == 11) {
                    x7 x7Var2 = (x7) view;
                    x7Var2.f15694a.setText(z7Var2.f15814e);
                    x7Var2.f15695b.setText((CharSequence) null);
                } else if (i13 == 5) {
                    try {
                        ((nv0) view).f37960b.getImageReceiver().P0(false);
                    } catch (Exception unused) {
                    }
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    if (z7Var2.f15814e == null) {
                        a9Var.setFixedSize(12);
                        a9Var.setText(null);
                        return;
                    }
                    a9Var.setFixedSize(0);
                    a9Var.setText(z7Var2.f15814e);
                } else if (i13 == 7) {
                    int i16 = z7Var2.f15813c;
                    if (i16 == 0) {
                        ((org.telegram.ui.Cells.n8) view).l(z7Var2.f15814e, q8Var.f15252x1, z10);
                    } else if (i16 == 1) {
                        ((org.telegram.ui.Cells.n8) view).l(z7Var2.f15814e, q8Var.f15253y1, z10);
                    } else if (i16 == 2) {
                        ((org.telegram.ui.Cells.n8) view).l(z7Var2.f15814e, q8Var.f15251w1, z10);
                    }
                } else if (i13 == 9) {
                    Drawable drawable = z7Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.n8) view).v(z7Var2.f15814e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.n8) view).q(z7Var2.f15814e, z7Var2.f15815f, false, z10);
                    }
                } else if (i13 == 8) {
                    ((org.telegram.ui.Cells.o4) view).setText(z7Var2.f15814e);
                } else if (i13 == 10) {
                    int i17 = q8.Y1;
                    int i18 = (int) np.u1(q8Var.f30139a).L6;
                    int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
                    int j3 = Utilities.j(q8Var.C1, i18, 0);
                    g0.f fVar = new g0.f(29);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.f31844c = a10;
                    t7Var.d = 20;
                    t7Var.f31845e = fVar;
                    ((org.telegram.ui.Cells.u7) view).d(j3, t7Var, new t6(this, 2));
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View u7Var;
        org.telegram.ui.Cells.n8 n8Var;
        nv0 nv0Var;
        Context context = this.d;
        if (i7 == -1) {
            u7Var = new View(context);
        } else if (i7 == 0) {
            u7Var = new View(context);
            u7Var.setTag(35);
        } else if (i7 == 1) {
            u7Var = new View(context);
            u7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.f14690e;
            if (i7 == 3) {
                u7Var = new p8(context, h6Var);
            } else {
                if (i7 == 4) {
                    nv0Var = new x7(context, h6Var, true);
                } else if (i7 == 11) {
                    u7Var = new x7(context, h6Var, false);
                } else if (i7 == 8) {
                    u7Var = new org.telegram.ui.Cells.o4(context, h6Var);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29420h5, u7Var, h6Var);
                } else if (i7 == 5) {
                    nv0 nv0Var2 = new nv0(context, null, 1, h6Var);
                    nv0Var2.d.setText(hd.N0(2131747974, null));
                    nv0Var2.f37962e.setText(hd.N0(2131745611, null));
                    nv0Var2.f37959a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    nv0Var = nv0Var2;
                } else if (i7 == 6) {
                    u7Var = new org.telegram.ui.Cells.a9(context, h6Var);
                    u7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.f14690e, true, true);
                    } else if (i7 == 9) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.f14690e, true, false);
                    } else if (i7 == 10) {
                        u7Var = new org.telegram.ui.Cells.u7(context, h6Var);
                    } else {
                        nv0Var = new ln(context, 1);
                    }
                    u7Var = n8Var;
                }
                u7Var = nv0Var;
            }
        }
        return new v4.e1(u7Var);
    }
}
