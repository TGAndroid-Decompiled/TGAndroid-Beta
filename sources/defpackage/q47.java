package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class q47 extends n39 {
    public final Context c;
    public final s47 d;

    public q47(s47 s47Var, Context context) {
        this.d = s47Var;
        this.c = context;
    }

    @Override
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
            return ((gh6) s49Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.R;
    }

    @Override
    public final int d(int i) {
        s47 s47Var = this.d;
        if (s47Var.S.contains(Integer.valueOf(i))) {
            return 1;
        }
        if (i != s47Var.I && i != s47Var.P) {
            if (i == s47Var.L) {
                return 3;
            }
            if (i == s47Var.M) {
                return 4;
            }
            if (i == s47Var.O) {
                return 5;
            }
            if (i == s47Var.Q) {
                return 6;
            }
            if (i == s47Var.N) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(defpackage.s49 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q47.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        s47 s47Var = this.d;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    view = new q86(context, gl.L(40.0f), gl.L(120.0f));
                                }
                            } else {
                                view = new y14(context, 16);
                                view.setLayoutParams(new e49(-1, 16));
                            }
                        } else {
                            view = new r47(s47Var, context);
                            view.setLayoutParams(new e49(-1, -2));
                        }
                    }
                    if (i == 4) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    mf0 mf0Var = new mf0(s47Var.getResourceProvider());
                    s47Var.d0 = mf0Var;
                    view = new p47(this, this.c, i2, mf0Var, s47Var.getResourceProvider());
                } else {
                    ld5 ld5Var = new ld5(this.c, bkb.F6, 16, 11, false, s47Var.getResourceProvider());
                    ld5Var.setHeight(43);
                    view = ld5Var;
                }
            } else {
                s47Var.getResourceProvider();
                view = new b9a(context, (de9) null);
            }
        } else {
            gh6 gh6Var = new gh6(this.c, 6, 2, false, s47Var.getResourceProvider());
            gh6Var.setDividerColor(bkb.c7);
            view = gh6Var;
        }
        return new s49(view);
    }
}
