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
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.nv0;
public final class g8 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.h6 f14716e;
    public final d8 f14717f;
    public ek0 h;
    public final k8 f14718n;

    public g8(k8 k8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, d8 d8Var, fi.o3 o3Var) {
        this.f14718n = k8Var;
        this.d = context;
        this.f14716e = h6Var;
        this.f14717f = d8Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59165f;
        if ((i7 != 3 || !this.f14718n.f14927a0.A1) && i7 != 7 && i7 != 9 && i7 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f14718n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        k8 k8Var = this.f14718n;
        ArrayList arrayList = k8Var.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            return ((y7) k8Var.M.get(i7)).f56630a;
        }
        return -1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        y7 y7Var;
        boolean z10;
        int i10;
        int i11;
        int i12;
        k8 k8Var = this.f14718n;
        p8 p8Var = k8Var.f14927a0;
        ArrayList arrayList = k8Var.M;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            y7 y7Var2 = (y7) arrayList.get(i7);
            int i13 = f1Var.f59165f;
            View view = f1Var.f59161a;
            boolean z11 = true;
            int i14 = i7 + 1;
            if (i14 < arrayList.size()) {
                y7Var = (y7) arrayList.get(i14);
            } else {
                y7Var = null;
            }
            if (y7Var != null && ((i12 = y7Var.f56630a) == i13 || (i12 == 9 && y7Var.f15809q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i13 == 3) {
                o8 o8Var = (o8) view;
                boolean z12 = y7Var2.f15806n;
                o8Var.d(z12, !z12);
                int i15 = y7Var2.f15801i;
                float f10 = 1.0f;
                if (i15 > 0) {
                    o8Var.e(i15, y7Var2.f15802j, y7Var2.f15800g);
                    o8Var.b(false, 1.0f);
                } else {
                    TLRPC.User user = y7Var2.f15800g;
                    if (user != null) {
                        o8Var.setUser(user);
                        if (y7Var2.f15804l && !y7Var2.f15803k) {
                            f10 = 0.5f;
                        }
                        o8Var.b(false, f10);
                    } else {
                        TLRPC.Chat chat = y7Var2.h;
                        if (chat != null) {
                            o8Var.a(p8.L0(p8Var, chat), chat);
                        }
                    }
                }
                if (!y7Var2.f15803k && !y7Var2.f15804l) {
                    z11 = false;
                }
                o8Var.c(z11, false);
                o8Var.setDivider(z10);
                o8Var.setRedCheckbox(y7Var2.f15805m);
                o8Var.f15231w = p8Var.A1;
            } else if (i13 != 2) {
                if (i13 == 0) {
                    view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                } else if (i13 == -1) {
                    if (y7Var2.f15807o > 0) {
                        ek0 ek0Var = this.h;
                        if (ek0Var != null && ek0Var.getMeasuredHeight() > 0) {
                            i11 = this.h.getMeasuredHeight() + k8Var.U;
                        } else {
                            i11 = org.telegram.messenger.g0.f24146q.y;
                        }
                        i10 = Math.max(i11 - y7Var2.f15807o, org.telegram.messenger.g0.L(120.0f));
                        view.setTag(33);
                    } else {
                        i10 = y7Var2.f15808p;
                        if (i10 >= 0) {
                            view.setTag(null);
                        } else {
                            i10 = (int) (org.telegram.messenger.g0.f24146q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new v4.q0(-1, i10));
                } else if (i13 == 1) {
                    view.setLayoutParams(new v4.q0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f14717f.L)));
                } else if (i13 == 4) {
                    w7 w7Var = (w7) view;
                    CharSequence charSequence = y7Var2.f15798e;
                    CharSequence charSequence2 = y7Var2.f15799f;
                    w7Var.f15719a.setText(charSequence);
                    w7Var.f15720b.setText(charSequence2);
                } else if (i13 == 11) {
                    w7 w7Var2 = (w7) view;
                    w7Var2.f15719a.setText(y7Var2.f15798e);
                    w7Var2.f15720b.setText((CharSequence) null);
                } else if (i13 == 5) {
                    try {
                        ((nv0) view).f37989b.getImageReceiver().P0(false);
                    } catch (Exception unused) {
                    }
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    if (y7Var2.f15798e == null) {
                        a9Var.setFixedSize(12);
                        a9Var.setText(null);
                        return;
                    }
                    a9Var.setFixedSize(0);
                    a9Var.setText(y7Var2.f15798e);
                } else if (i13 == 7) {
                    int i16 = y7Var2.f15797c;
                    if (i16 == 0) {
                        ((org.telegram.ui.Cells.n8) view).l(y7Var2.f15798e, p8Var.f15276x1, z10);
                    } else if (i16 == 1) {
                        ((org.telegram.ui.Cells.n8) view).l(y7Var2.f15798e, p8Var.f15277y1, z10);
                    } else if (i16 == 2) {
                        ((org.telegram.ui.Cells.n8) view).l(y7Var2.f15798e, p8Var.f15275w1, z10);
                    }
                } else if (i13 == 9) {
                    Drawable drawable = y7Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.n8) view).v(y7Var2.f15798e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.n8) view).q(y7Var2.f15798e, y7Var2.f15799f, false, z10);
                    }
                } else if (i13 == 8) {
                    ((org.telegram.ui.Cells.o4) view).setText(y7Var2.f15798e);
                } else if (i13 == 10) {
                    int i17 = p8.Y1;
                    int i18 = (int) mp.u1(p8Var.f30170a).L6;
                    int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
                    int j3 = Utilities.j(p8Var.C1, i18, 0);
                    g0.e eVar = new g0.e(29);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.f31875c = a10;
                    t7Var.d = 20;
                    t7Var.f31876e = eVar;
                    ((org.telegram.ui.Cells.u7) view).d(j3, t7Var, new s6(this, 2));
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
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
            org.telegram.ui.ActionBar.h6 h6Var = this.f14716e;
            if (i7 == 3) {
                u7Var = new o8(context, h6Var);
            } else {
                if (i7 == 4) {
                    nv0Var = new w7(context, h6Var, true);
                } else if (i7 == 11) {
                    u7Var = new w7(context, h6Var, false);
                } else if (i7 == 8) {
                    u7Var = new org.telegram.ui.Cells.o4(context, h6Var);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29451h5, u7Var, h6Var);
                } else if (i7 == 5) {
                    nv0 nv0Var2 = new nv0(context, null, 1, h6Var);
                    nv0Var2.d.setText(gd.N0(2131747974, null));
                    nv0Var2.f37991e.setText(gd.N0(2131745611, null));
                    nv0Var2.f37988a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    nv0Var = nv0Var2;
                } else if (i7 == 6) {
                    u7Var = new org.telegram.ui.Cells.a9(context, h6Var);
                    u7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.f14716e, true, true);
                    } else if (i7 == 9) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.f14716e, true, false);
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
        return new v4.f1(u7Var);
    }
}
