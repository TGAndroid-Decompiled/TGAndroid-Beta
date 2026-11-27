package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class x67 extends c79 {
    public final Context c;
    public final z67 d;

    public x67(z67 z67Var, Context context) {
        this.d = z67Var;
        this.c = context;
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
            return ((lj6) f89Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.R;
    }

    @Override
    public final int d(int i) {
        z67 z67Var = this.d;
        if (z67Var.S.contains(Integer.valueOf(i))) {
            return 1;
        }
        if (i != z67Var.I && i != z67Var.P) {
            if (i == z67Var.L) {
                return 3;
            }
            if (i == z67Var.M) {
                return 4;
            }
            if (i == z67Var.O) {
                return 5;
            }
            if (i == z67Var.Q) {
                return 6;
            }
            if (i == z67Var.N) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(defpackage.f89 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x67.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        z67 z67Var = this.d;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    view = new ua6(context, hl.L(40.0f), hl.L(120.0f));
                                }
                            } else {
                                view = new t24(context, 16);
                                view.setLayoutParams(new r79(-1, 16));
                            }
                        } else {
                            view = new y67(z67Var, context);
                            view.setLayoutParams(new r79(-1, -2));
                        }
                    }
                    if (i == 4) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    of0 of0Var = new of0(z67Var.getResourceProvider());
                    z67Var.d0 = of0Var;
                    view = new w67(this, this.c, i2, of0Var, z67Var.getResourceProvider());
                } else {
                    mf5 mf5Var = new mf5(this.c, aob.G6, 16, 11, false, z67Var.getResourceProvider());
                    mf5Var.setHeight(43);
                    view = mf5Var;
                }
            } else {
                z67Var.getResourceProvider();
                view = new sca(context, (uh9) null);
            }
        } else {
            lj6 lj6Var = new lj6(this.c, 6, 2, false, z67Var.getResourceProvider());
            lj6Var.setDividerColor(aob.d7);
            view = lj6Var;
        }
        return new f89(view);
    }
}
