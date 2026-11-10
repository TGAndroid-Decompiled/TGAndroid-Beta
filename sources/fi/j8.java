package fi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sm;
public final class j8 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.h6 f12242e;
    public final g8 f12243f;
    public pj0 h;
    public final n8 f12244n;

    public j8(n8 n8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, g8 g8Var, di.x3 x3Var) {
        this.f12244n = n8Var;
        this.d = context;
        this.f12242e = h6Var;
        this.f12243f = g8Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if ((i7 != 3 || !this.f12244n.W.f12818z1) && i7 != 7 && i7 != 9 && i7 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f12244n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        n8 n8Var = this.f12244n;
        ArrayList arrayList = n8Var.L;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            return ((b8) n8Var.L.get(i7)).f54543a;
        }
        return -1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        b8 b8Var;
        boolean z9;
        int i10;
        int i11;
        int i12;
        n8 n8Var = this.f12244n;
        s8 s8Var = n8Var.W;
        ArrayList arrayList = n8Var.L;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            b8 b8Var2 = (b8) arrayList.get(i7);
            int i13 = d1Var.f57056f;
            View view = d1Var.f57052a;
            boolean z10 = true;
            int i14 = i7 + 1;
            if (i14 < arrayList.size()) {
                b8Var = (b8) arrayList.get(i14);
            } else {
                b8Var = null;
            }
            if (b8Var != null && ((i12 = b8Var.f54543a) == i13 || (i12 == 9 && b8Var.f11708q == 1))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i13 == 3) {
                r8 r8Var = (r8) view;
                boolean z11 = b8Var2.f11705n;
                r8Var.d(z11, !z11);
                int i15 = b8Var2.f11700i;
                float f10 = 1.0f;
                if (i15 > 0) {
                    r8Var.e(i15, b8Var2.f11701j, b8Var2.f11699g);
                    r8Var.b(false, 1.0f);
                } else {
                    TLRPC.User user = b8Var2.f11699g;
                    if (user != null) {
                        r8Var.setUser(user);
                        if (b8Var2.f11703l && !b8Var2.f11702k) {
                            f10 = 0.5f;
                        }
                        r8Var.b(false, f10);
                    } else {
                        TLRPC.Chat chat = b8Var2.h;
                        if (chat != null) {
                            r8Var.a(s8.K0(s8Var, chat), chat);
                        }
                    }
                }
                if (!b8Var2.f11702k && !b8Var2.f11703l) {
                    z10 = false;
                }
                r8Var.c(z10, false);
                r8Var.setDivider(z9);
                r8Var.setRedCheckbox(b8Var2.f11704m);
                r8Var.f12759w = s8Var.f12818z1;
            } else if (i13 != 2) {
                if (i13 == 0) {
                    view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                } else if (i13 == -1) {
                    if (b8Var2.f11706o > 0) {
                        pj0 pj0Var = this.h;
                        if (pj0Var != null && pj0Var.getMeasuredHeight() > 0) {
                            i11 = this.h.getMeasuredHeight() + n8Var.T;
                        } else {
                            i11 = org.telegram.messenger.g0.f22567q.y;
                        }
                        i10 = Math.max(i11 - b8Var2.f11706o, org.telegram.messenger.g0.L(120.0f));
                        view.setTag(33);
                    } else {
                        i10 = b8Var2.f11707p;
                        if (i10 >= 0) {
                            view.setTag(null);
                        } else {
                            i10 = (int) (org.telegram.messenger.g0.f22567q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new v4.o0(-1, i10));
                } else if (i13 == 1) {
                    view.setLayoutParams(new v4.o0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f12243f.K)));
                } else if (i13 == 4) {
                    z7 z7Var = (z7) view;
                    CharSequence charSequence = b8Var2.f11697e;
                    CharSequence charSequence2 = b8Var2.f11698f;
                    z7Var.f13253a.setText(charSequence);
                    z7Var.f13254b.setText(charSequence2);
                } else if (i13 == 11) {
                    z7 z7Var2 = (z7) view;
                    z7Var2.f13253a.setText(b8Var2.f11697e);
                    z7Var2.f13254b.setText((CharSequence) null);
                } else if (i13 == 5) {
                    try {
                        ((bv0) view).f32366b.getImageReceiver().P0(false);
                    } catch (Exception unused) {
                    }
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    if (b8Var2.f11697e == null) {
                        z8Var.setFixedSize(12);
                        z8Var.setText(null);
                        return;
                    }
                    z8Var.setFixedSize(0);
                    z8Var.setText(b8Var2.f11697e);
                } else if (i13 == 7) {
                    int i16 = b8Var2.f11696c;
                    if (i16 == 0) {
                        ((org.telegram.ui.Cells.m8) view).l(b8Var2.f11697e, s8Var.f12815w1, z9);
                    } else if (i16 == 1) {
                        ((org.telegram.ui.Cells.m8) view).l(b8Var2.f11697e, s8Var.f12816x1, z9);
                    } else if (i16 == 2) {
                        ((org.telegram.ui.Cells.m8) view).l(b8Var2.f11697e, s8Var.f12814v1, z9);
                    }
                } else if (i13 == 9) {
                    Drawable drawable = b8Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.m8) view).v(b8Var2.f11697e, drawable, z9);
                    } else {
                        ((org.telegram.ui.Cells.m8) view).q(b8Var2.f11697e, b8Var2.f11698f, false, z9);
                    }
                } else if (i13 == 8) {
                    ((org.telegram.ui.Cells.n4) view).setText(b8Var2.f11697e);
                } else if (i13 == 10) {
                    int i17 = s8.X1;
                    int i18 = (int) qp.s1(s8Var.f28669a).I6;
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
                    int j3 = Utilities.j(s8Var.B1, i18, 0);
                    di.a1 a1Var = new di.a1(23);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.f30295c = a10;
                    s7Var.d = 20;
                    s7Var.f30296e = a1Var;
                    ((org.telegram.ui.Cells.t7) view).d(j3, s7Var, new ai.i(this, 27));
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View t7Var;
        org.telegram.ui.Cells.m8 m8Var;
        bv0 bv0Var;
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
            org.telegram.ui.ActionBar.h6 h6Var = this.f12242e;
            if (i7 == 3) {
                t7Var = new r8(context, h6Var);
            } else {
                if (i7 == 4) {
                    bv0Var = new z7(context, h6Var, true);
                } else if (i7 == 11) {
                    t7Var = new z7(context, h6Var, false);
                } else if (i7 == 8) {
                    t7Var = new org.telegram.ui.Cells.n4(context, h6Var);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, t7Var, h6Var);
                } else if (i7 == 5) {
                    bv0 bv0Var2 = new bv0(context, null, 1, h6Var);
                    bv0Var2.d.setText(id.M0(2131748167, null));
                    bv0Var2.f32368e.setText(id.M0(2131745807, null));
                    bv0Var2.f32365a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    bv0Var = bv0Var2;
                } else if (i7 == 6) {
                    t7Var = new org.telegram.ui.Cells.z8(context, h6Var);
                    t7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.f12242e, true, true);
                    } else if (i7 == 9) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.f12242e, true, false);
                    } else if (i7 == 10) {
                        t7Var = new org.telegram.ui.Cells.t7(context, h6Var);
                    } else {
                        bv0Var = new sm(context, 1);
                    }
                    t7Var = m8Var;
                }
                t7Var = bv0Var;
            }
        }
        return new v4.d1(t7Var);
    }
}
