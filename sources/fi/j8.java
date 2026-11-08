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
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tm;
public final class j8 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f12239e;
    public final g8 f12240f;
    public pj0 h;
    public final n8 f12241n;

    public j8(n8 n8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, g8 g8Var, di.w3 w3Var) {
        this.f12241n = n8Var;
        this.d = context;
        this.f12239e = f6Var;
        this.f12240f = g8Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if ((i7 != 3 || !this.f12241n.W.f12815w1) && i7 != 7 && i7 != 9 && i7 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f12241n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        n8 n8Var = this.f12241n;
        ArrayList arrayList = n8Var.L;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            return ((b8) n8Var.L.get(i7)).f54532a;
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
        n8 n8Var = this.f12241n;
        s8 s8Var = n8Var.W;
        ArrayList arrayList = n8Var.L;
        if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
            b8 b8Var2 = (b8) arrayList.get(i7);
            int i13 = d1Var.f57048f;
            View view = d1Var.f57044a;
            boolean z10 = true;
            int i14 = i7 + 1;
            if (i14 < arrayList.size()) {
                b8Var = (b8) arrayList.get(i14);
            } else {
                b8Var = null;
            }
            if (b8Var != null && ((i12 = b8Var.f54532a) == i13 || (i12 == 9 && b8Var.f11703q == 1))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i13 == 3) {
                r8 r8Var = (r8) view;
                boolean z11 = b8Var2.f11700n;
                r8Var.d(z11, !z11);
                int i15 = b8Var2.f11695i;
                float f10 = 1.0f;
                if (i15 > 0) {
                    r8Var.e(i15, b8Var2.f11696j, b8Var2.f11694g);
                    r8Var.b(false, 1.0f);
                } else {
                    TLRPC.User user = b8Var2.f11694g;
                    if (user != null) {
                        r8Var.setUser(user);
                        if (b8Var2.f11698l && !b8Var2.f11697k) {
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
                if (!b8Var2.f11697k && !b8Var2.f11698l) {
                    z10 = false;
                }
                r8Var.c(z10, false);
                r8Var.setDivider(z9);
                r8Var.setRedCheckbox(b8Var2.f11699m);
                r8Var.f12754w = s8Var.f12815w1;
            } else if (i13 != 2) {
                if (i13 == 0) {
                    view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                } else if (i13 == -1) {
                    if (b8Var2.f11701o > 0) {
                        pj0 pj0Var = this.h;
                        if (pj0Var != null && pj0Var.getMeasuredHeight() > 0) {
                            i11 = this.h.getMeasuredHeight() + n8Var.T;
                        } else {
                            i11 = org.telegram.messenger.g0.f22563q.y;
                        }
                        i10 = Math.max(i11 - b8Var2.f11701o, org.telegram.messenger.g0.L(120.0f));
                        view.setTag(33);
                    } else {
                        i10 = b8Var2.f11702p;
                        if (i10 >= 0) {
                            view.setTag(null);
                        } else {
                            i10 = (int) (org.telegram.messenger.g0.f22563q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new v4.o0(-1, i10));
                } else if (i13 == 1) {
                    view.setLayoutParams(new v4.o0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f12240f.K)));
                } else if (i13 == 4) {
                    z7 z7Var = (z7) view;
                    CharSequence charSequence = b8Var2.f11692e;
                    CharSequence charSequence2 = b8Var2.f11693f;
                    z7Var.f13251a.setText(charSequence);
                    z7Var.f13252b.setText(charSequence2);
                } else if (i13 == 11) {
                    z7 z7Var2 = (z7) view;
                    z7Var2.f13251a.setText(b8Var2.f11692e);
                    z7Var2.f13252b.setText((CharSequence) null);
                } else if (i13 == 5) {
                    try {
                        ((av0) view).f31925b.getImageReceiver().P0(false);
                    } catch (Exception unused) {
                    }
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    if (b8Var2.f11692e == null) {
                        z8Var.setFixedSize(12);
                        z8Var.setText(null);
                        return;
                    }
                    z8Var.setFixedSize(0);
                    z8Var.setText(b8Var2.f11692e);
                } else if (i13 == 7) {
                    int i16 = b8Var2.f11691c;
                    if (i16 == 0) {
                        ((org.telegram.ui.Cells.m8) view).l(b8Var2.f11692e, s8Var.f12812t1, z9);
                    } else if (i16 == 1) {
                        ((org.telegram.ui.Cells.m8) view).l(b8Var2.f11692e, s8Var.f12813u1, z9);
                    } else if (i16 == 2) {
                        ((org.telegram.ui.Cells.m8) view).l(b8Var2.f11692e, s8Var.f12811s1, z9);
                    }
                } else if (i13 == 9) {
                    Drawable drawable = b8Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.m8) view).v(b8Var2.f11692e, drawable, z9);
                    } else {
                        ((org.telegram.ui.Cells.m8) view).q(b8Var2.f11692e, b8Var2.f11693f, false, z9);
                    }
                } else if (i13 == 8) {
                    ((org.telegram.ui.Cells.n4) view).setText(b8Var2.f11692e);
                } else if (i13 == 10) {
                    int i17 = s8.U1;
                    int i18 = (int) qp.s1(s8Var.f28616a).I6;
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
                    int j3 = Utilities.j(s8Var.f12817y1, i18, 0);
                    di.a1 a1Var = new di.a1(23);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.f30280c = a10;
                    s7Var.d = 20;
                    s7Var.f30281e = a1Var;
                    ((org.telegram.ui.Cells.t7) view).d(j3, s7Var, new ai.i(this, 27));
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View t7Var;
        org.telegram.ui.Cells.m8 m8Var;
        av0 av0Var;
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
            org.telegram.ui.ActionBar.f6 f6Var = this.f12239e;
            if (i7 == 3) {
                t7Var = new r8(context, f6Var);
            } else {
                if (i7 == 4) {
                    av0Var = new z7(context, f6Var, true);
                } else if (i7 == 11) {
                    t7Var = new z7(context, f6Var, false);
                } else if (i7 == 8) {
                    t7Var = new org.telegram.ui.Cells.n4(context, f6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27925h5, t7Var, f6Var);
                } else if (i7 == 5) {
                    av0 av0Var2 = new av0(context, null, 1, f6Var);
                    av0Var2.d.setText(id.M0(2131748168, null));
                    av0Var2.f31927e.setText(id.M0(2131745810, null));
                    av0Var2.f31924a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    av0Var = av0Var2;
                } else if (i7 == 6) {
                    t7Var = new org.telegram.ui.Cells.z8(context, f6Var);
                    t7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.f12239e, true, true);
                    } else if (i7 == 9) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.f12239e, true, false);
                    } else if (i7 == 10) {
                        t7Var = new org.telegram.ui.Cells.t7(context, f6Var);
                    } else {
                        av0Var = new tm(context, 1);
                    }
                    t7Var = m8Var;
                }
                t7Var = av0Var;
            }
        }
        return new v4.d1(t7Var);
    }
}
