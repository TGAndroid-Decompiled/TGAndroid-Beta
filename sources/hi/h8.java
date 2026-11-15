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
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.uj0;
public final class h8 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f14382e;
    public final e8 f14383f;
    public uj0 h;
    public final l8 f14384n;

    public h8(l8 l8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, e8 e8Var, fi.q3 q3Var) {
        this.f14384n = l8Var;
        this.d = context;
        this.f14382e = e6Var;
        this.f14383f = e8Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if ((i7 != 3 || !this.f14384n.f14600a0.A1) && i7 != 7 && i7 != 9 && i7 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f14384n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        l8 l8Var = this.f14384n;
        ArrayList arrayList = l8Var.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            return ((z7) l8Var.M.get(i7)).f56015a;
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
        l8 l8Var = this.f14384n;
        q8 q8Var = l8Var.f14600a0;
        ArrayList arrayList = l8Var.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            z7 z7Var2 = (z7) arrayList.get(i7);
            int i13 = e1Var.f58539f;
            View view = e1Var.f58535a;
            boolean z11 = true;
            int i14 = i7 + 1;
            if (i14 < arrayList.size()) {
                z7Var = (z7) arrayList.get(i14);
            } else {
                z7Var = null;
            }
            if (z7Var != null && ((i12 = z7Var.f56015a) == i13 || (i12 == 9 && z7Var.f15520q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i13 == 3) {
                p8 p8Var = (p8) view;
                boolean z12 = z7Var2.f15517n;
                p8Var.d(z12, !z12);
                int i15 = z7Var2.f15512i;
                float f10 = 1.0f;
                if (i15 > 0) {
                    p8Var.e(i15, z7Var2.f15513j, z7Var2.f15511g);
                    p8Var.b(false, 1.0f);
                } else {
                    TLRPC.User user = z7Var2.f15511g;
                    if (user != null) {
                        p8Var.setUser(user);
                        if (z7Var2.f15515l && !z7Var2.f15514k) {
                            f10 = 0.5f;
                        }
                        p8Var.b(false, f10);
                    } else {
                        TLRPC.Chat chat = z7Var2.h;
                        if (chat != null) {
                            p8Var.a(q8.K0(q8Var, chat), chat);
                        }
                    }
                }
                if (!z7Var2.f15514k && !z7Var2.f15515l) {
                    z11 = false;
                }
                p8Var.c(z11, false);
                p8Var.setDivider(z10);
                p8Var.setRedCheckbox(z7Var2.f15516m);
                p8Var.f14878w = q8Var.A1;
            } else if (i13 != 2) {
                if (i13 == 0) {
                    view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                } else if (i13 == -1) {
                    if (z7Var2.f15518o > 0) {
                        uj0 uj0Var = this.h;
                        if (uj0Var != null && uj0Var.getMeasuredHeight() > 0) {
                            i11 = this.h.getMeasuredHeight() + l8Var.U;
                        } else {
                            i11 = org.telegram.messenger.g0.f23611q.y;
                        }
                        i10 = Math.max(i11 - z7Var2.f15518o, org.telegram.messenger.g0.L(120.0f));
                        view.setTag(33);
                    } else {
                        i10 = z7Var2.f15519p;
                        if (i10 >= 0) {
                            view.setTag(null);
                        } else {
                            i10 = (int) (org.telegram.messenger.g0.f23611q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new v4.p0(-1, i10));
                } else if (i13 == 1) {
                    view.setLayoutParams(new v4.p0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f14383f.L)));
                } else if (i13 == 4) {
                    x7 x7Var = (x7) view;
                    CharSequence charSequence = z7Var2.f15509e;
                    CharSequence charSequence2 = z7Var2.f15510f;
                    x7Var.f15385a.setText(charSequence);
                    x7Var.f15386b.setText(charSequence2);
                } else if (i13 == 11) {
                    x7 x7Var2 = (x7) view;
                    x7Var2.f15385a.setText(z7Var2.f15509e);
                    x7Var2.f15386b.setText((CharSequence) null);
                } else if (i13 == 5) {
                    try {
                        ((cv0) view).f33707b.getImageReceiver().P0(false);
                    } catch (Exception unused) {
                    }
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    if (z7Var2.f15509e == null) {
                        y8Var.setFixedSize(12);
                        y8Var.setText(null);
                        return;
                    }
                    y8Var.setFixedSize(0);
                    y8Var.setText(z7Var2.f15509e);
                } else if (i13 == 7) {
                    int i16 = z7Var2.f15508c;
                    if (i16 == 0) {
                        ((org.telegram.ui.Cells.l8) view).l(z7Var2.f15509e, q8Var.f14928x1, z10);
                    } else if (i16 == 1) {
                        ((org.telegram.ui.Cells.l8) view).l(z7Var2.f15509e, q8Var.f14929y1, z10);
                    } else if (i16 == 2) {
                        ((org.telegram.ui.Cells.l8) view).l(z7Var2.f15509e, q8Var.f14927w1, z10);
                    }
                } else if (i13 == 9) {
                    Drawable drawable = z7Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.l8) view).v(z7Var2.f15509e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.l8) view).q(z7Var2.f15509e, z7Var2.f15510f, false, z10);
                    }
                } else if (i13 == 8) {
                    ((org.telegram.ui.Cells.n4) view).setText(z7Var2.f15509e);
                } else if (i13 == 10) {
                    int i17 = q8.Y1;
                    int i18 = (int) np.s1(q8Var.f29679a).J6;
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
                    int j3 = Utilities.j(q8Var.C1, i18, 0);
                    g0.e eVar = new g0.e(28);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.f31358c = a10;
                    r7Var.d = 20;
                    r7Var.f31359e = eVar;
                    ((org.telegram.ui.Cells.s7) view).d(j3, r7Var, new g7(this, 1));
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View s7Var;
        org.telegram.ui.Cells.l8 l8Var;
        cv0 cv0Var;
        Context context = this.d;
        if (i7 == -1) {
            s7Var = new View(context);
        } else if (i7 == 0) {
            s7Var = new View(context);
            s7Var.setTag(35);
        } else if (i7 == 1) {
            s7Var = new View(context);
            s7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.f14382e;
            if (i7 == 3) {
                s7Var = new p8(context, e6Var);
            } else {
                if (i7 == 4) {
                    cv0Var = new x7(context, e6Var, true);
                } else if (i7 == 11) {
                    s7Var = new x7(context, e6Var, false);
                } else if (i7 == 8) {
                    s7Var = new org.telegram.ui.Cells.n4(context, e6Var);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, s7Var, e6Var);
                } else if (i7 == 5) {
                    cv0 cv0Var2 = new cv0(context, null, 1, e6Var);
                    cv0Var2.d.setText(hd.M0(2131748167, null));
                    cv0Var2.f33709e.setText(hd.M0(2131745807, null));
                    cv0Var2.f33706a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    cv0Var = cv0Var2;
                } else if (i7 == 6) {
                    s7Var = new org.telegram.ui.Cells.y8(context, e6Var);
                    s7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.f14382e, true, true);
                    } else if (i7 == 9) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.f14382e, true, false);
                    } else if (i7 == 10) {
                        s7Var = new org.telegram.ui.Cells.s7(context, e6Var);
                    } else {
                        cv0Var = new bn(context, 1);
                    }
                    s7Var = l8Var;
                }
                s7Var = cv0Var;
            }
        }
        return new v4.e1(s7Var);
    }
}
