package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class r67 extends q59 {
    public final Context c;
    public final t67 d;

    public r67(t67 t67Var, Context context) {
        this.d = t67Var;
        this.c = context;
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
            return ((ij6) u69Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.R;
    }

    @Override
    public final int d(int i) {
        t67 t67Var = this.d;
        if (t67Var.S.contains(Integer.valueOf(i))) {
            return 1;
        }
        if (i != t67Var.I && i != t67Var.P) {
            if (i == t67Var.L) {
                return 3;
            }
            if (i == t67Var.M) {
                return 4;
            }
            if (i == t67Var.O) {
                return 5;
            }
            if (i == t67Var.Q) {
                return 6;
            }
            if (i == t67Var.N) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(defpackage.u69 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r67.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        t67 t67Var = this.d;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    view = new pa6(context, gm.L(40.0f), gm.L(120.0f));
                                }
                            } else {
                                view = new j34(context, 16);
                                view.setLayoutParams(new g69(-1, 16));
                            }
                        } else {
                            view = new s67(t67Var, context);
                            view.setLayoutParams(new g69(-1, -2));
                        }
                    }
                    if (i == 4) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    mg0 mg0Var = new mg0(t67Var.getResourceProvider());
                    t67Var.d0 = mg0Var;
                    view = new q67(this, this.c, i2, mg0Var, t67Var.getResourceProvider());
                } else {
                    jf5 jf5Var = new jf5(this.c, cmb.F6, 16, 11, false, t67Var.getResourceProvider());
                    jf5Var.setHeight(43);
                    view = jf5Var;
                }
            } else {
                t67Var.getResourceProvider();
                view = new bba(context, (hg9) null);
            }
        } else {
            ij6 ij6Var = new ij6(this.c, 6, 2, false, t67Var.getResourceProvider());
            ij6Var.setDividerColor(cmb.c7);
            view = ij6Var;
        }
        return new u69(view);
    }
}
