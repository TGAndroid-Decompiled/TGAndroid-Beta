package gi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.zu0;
public final class k8 extends sg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f13041e;
    public final f8 f13042f;
    public tj0 h;
    public final o8 f13043n;

    public k8(o8 o8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, f8 f8Var, ei.y3 y3Var) {
        this.f13043n = o8Var;
        this.d = context;
        this.f13041e = e6Var;
        this.f13042f = f8Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if ((i3 != 3 || !this.f13043n.f13340a0.f13633x1) && i3 != 7 && i3 != 9 && i3 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f13043n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i3) {
        o8 o8Var = this.f13043n;
        ArrayList arrayList = o8Var.M;
        if (arrayList != null && i3 >= 0 && i3 < arrayList.size()) {
            return ((a8) o8Var.M.get(i3)).f54715a;
        }
        return -1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        a8 a8Var;
        boolean z10;
        int i10;
        int i11;
        int i12;
        o8 o8Var = this.f13043n;
        t8 t8Var = o8Var.f13340a0;
        ArrayList arrayList = o8Var.M;
        if (arrayList != null && i3 >= 0 && i3 < arrayList.size()) {
            a8 a8Var2 = (a8) arrayList.get(i3);
            int i13 = d1Var.f55544f;
            View view = d1Var.f55540a;
            boolean z11 = true;
            int i14 = i3 + 1;
            if (i14 < arrayList.size()) {
                a8Var = (a8) arrayList.get(i14);
            } else {
                a8Var = null;
            }
            if (a8Var != null && ((i12 = a8Var.f54715a) == i13 || (i12 == 9 && a8Var.f12408q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i13 == 3) {
                s8 s8Var = (s8) view;
                boolean z12 = a8Var2.f12405n;
                s8Var.d(z12, !z12);
                int i15 = a8Var2.f12400i;
                float f10 = 1.0f;
                if (i15 > 0) {
                    s8Var.e(i15, a8Var2.f12401j, a8Var2.f12399g);
                    s8Var.b(false, 1.0f);
                } else {
                    TLRPC.User user = a8Var2.f12399g;
                    if (user != null) {
                        s8Var.setUser(user);
                        if (a8Var2.f12403l && !a8Var2.f12402k) {
                            f10 = 0.5f;
                        }
                        s8Var.b(false, f10);
                    } else {
                        TLRPC.Chat chat = a8Var2.h;
                        if (chat != null) {
                            s8Var.a(t8.K0(t8Var, chat), chat);
                        }
                    }
                }
                if (!a8Var2.f12402k && !a8Var2.f12403l) {
                    z11 = false;
                }
                s8Var.c(z11, false);
                s8Var.setDivider(z10);
                s8Var.setRedCheckbox(a8Var2.f12404m);
                s8Var.f13577w = t8Var.f13633x1;
            } else if (i13 != 2) {
                if (i13 == 0) {
                    view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                } else if (i13 == -1) {
                    if (a8Var2.f12406o > 0) {
                        tj0 tj0Var = this.h;
                        if (tj0Var != null && tj0Var.getMeasuredHeight() > 0) {
                            i11 = this.h.getMeasuredHeight() + o8Var.U;
                        } else {
                            i11 = org.telegram.messenger.g0.f22608q.y;
                        }
                        i10 = Math.max(i11 - a8Var2.f12406o, org.telegram.messenger.g0.L(120.0f));
                        view.setTag(33);
                    } else {
                        i10 = a8Var2.f12407p;
                        if (i10 >= 0) {
                            view.setTag(null);
                        } else {
                            i10 = (int) (org.telegram.messenger.g0.f22608q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new u4.p0(-1, i10));
                } else if (i13 == 1) {
                    view.setLayoutParams(new u4.p0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f13042f.L)));
                } else if (i13 == 4) {
                    y7 y7Var = (y7) view;
                    CharSequence charSequence = a8Var2.f12397e;
                    CharSequence charSequence2 = a8Var2.f12398f;
                    y7Var.f13976a.setText(charSequence);
                    y7Var.f13977b.setText(charSequence2);
                } else if (i13 == 11) {
                    y7 y7Var2 = (y7) view;
                    y7Var2.f13976a.setText(a8Var2.f12397e);
                    y7Var2.f13977b.setText((CharSequence) null);
                } else if (i13 == 5) {
                    try {
                        ((zu0) view).f41126b.getImageReceiver().P0(false);
                    } catch (Exception unused) {
                    }
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    if (a8Var2.f12397e == null) {
                        y8Var.setFixedSize(12);
                        y8Var.setText(null);
                        return;
                    }
                    y8Var.setFixedSize(0);
                    y8Var.setText(a8Var2.f12397e);
                } else if (i13 == 7) {
                    int i16 = a8Var2.f12396c;
                    if (i16 == 0) {
                        ((org.telegram.ui.Cells.l8) view).l(a8Var2.f12397e, t8Var.f13630u1, z10);
                    } else if (i16 == 1) {
                        ((org.telegram.ui.Cells.l8) view).l(a8Var2.f12397e, t8Var.f13631v1, z10);
                    } else if (i16 == 2) {
                        ((org.telegram.ui.Cells.l8) view).l(a8Var2.f12397e, t8Var.f13629t1, z10);
                    }
                } else if (i13 == 9) {
                    Drawable drawable = a8Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.l8) view).v(a8Var2.f12397e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.l8) view).q(a8Var2.f12397e, a8Var2.f12398f, false, z10);
                    }
                } else if (i13 == 8) {
                    ((org.telegram.ui.Cells.n4) view).setText(a8Var2.f12397e);
                } else if (i13 == 10) {
                    int i17 = t8.V1;
                    int i18 = (int) hp.s1(t8Var.f28583a).I6;
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
                    int j10 = Utilities.j(t8Var.f13635z1, i18, 0);
                    i8 i8Var = new i8(0);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.f30282c = a10;
                    r7Var.d = 20;
                    r7Var.f30283e = i8Var;
                    ((org.telegram.ui.Cells.s7) view).d(j10, r7Var, new j8(this, 0));
                }
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View smVar;
        org.telegram.ui.Cells.l8 l8Var;
        View view;
        Context context = this.d;
        if (i3 == -1) {
            smVar = new View(context);
        } else if (i3 == 0) {
            smVar = new View(context);
            smVar.setTag(35);
        } else if (i3 == 1) {
            smVar = new View(context);
            smVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.f13041e;
            if (i3 == 3) {
                smVar = new s8(context, e6Var);
            } else {
                if (i3 == 4) {
                    view = new y7(context, e6Var, true);
                } else if (i3 == 11) {
                    smVar = new y7(context, e6Var, false);
                } else if (i3 == 8) {
                    smVar = new org.telegram.ui.Cells.n4(context, e6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, smVar, e6Var);
                } else if (i3 == 5) {
                    zu0 zu0Var = new zu0(context, null, 1, e6Var);
                    zu0Var.d.setText(bd.M0(2131748175, null));
                    zu0Var.f41128e.setText(bd.M0(2131745817, null));
                    zu0Var.f41125a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    view = zu0Var;
                } else if (i3 == 6) {
                    smVar = new org.telegram.ui.Cells.y8(context, e6Var);
                    smVar.setBackgroundColor(-15921907);
                } else {
                    if (i3 == 7) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.f13041e, true, true);
                    } else if (i3 == 9) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.f13041e, true, false);
                    } else if (i3 == 10) {
                        smVar = new org.telegram.ui.Cells.s7(context, e6Var);
                    } else {
                        smVar = new sm(context, 2);
                    }
                    smVar = l8Var;
                }
                smVar = view;
            }
        }
        return new u4.d1(smVar);
    }
}
