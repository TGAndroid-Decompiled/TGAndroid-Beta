package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class un8 extends c79 {
    public final Context c;
    public final vn8 d;

    public un8(vn8 vn8Var, Context context) {
        this.d = vn8Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 0 && i != 2 && i != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.e;
    }

    @Override
    public final int d(int i) {
        vn8 vn8Var = this.d;
        if (i == vn8Var.x) {
            return 4;
        }
        if (i == vn8Var.n) {
            return 3;
        }
        if (i == vn8Var.f) {
            return 2;
        }
        if (i != vn8Var.h && i != vn8Var.w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String M0;
        String M02;
        vn8 vn8Var = this.d;
        boolean z = vn8Var.E;
        int i2 = f89Var.f;
        View view = f89Var.a;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        mf5 mf5Var = (mf5) view;
                        if (i == vn8Var.n) {
                            if (z) {
                                mf5Var.setText(ob6.G(vn8Var.getMessagesController().y0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                mf5Var.setText(ob6.M0(2131746569, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                ij6 ij6Var = (ij6) view;
                ij6Var.a(aob.v6, aob.u6);
                if (z) {
                    ij6Var.b(2131232104, 5, ob6.M0(2131753685, null), false);
                    return;
                } else {
                    ob6.M0(2131746597, null);
                    throw null;
                }
            }
            ilb ilbVar = (ilb) view;
            if (i == vn8Var.h) {
                if (z) {
                    ilbVar.setFixedSize(0);
                    ilbVar.setText(ob6.M0(2131753670, null));
                    return;
                }
                ilbVar.setFixedSize(8);
                ilbVar.setText(null);
                return;
            } else if (i == vn8Var.w) {
                ilbVar.setFixedSize(12);
                ilbVar.setText("");
                return;
            } else {
                return;
            }
        }
        lj6 lj6Var = (lj6) view;
        if (z) {
            long keyAt = vn8Var.getMessagesController().x0.keyAt(i - vn8Var.r);
            lj6Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User X1 = vn8Var.getMessagesController().X1(Long.valueOf(keyAt));
                if (X1 != null) {
                    if (X1.bot) {
                        M02 = ob6.M0(2131753149, null).substring(0, 1).toUpperCase() + ob6.M0(2131753149, null).substring(1);
                    } else {
                        String str = X1.phone;
                        if (str != null && str.length() != 0) {
                            M02 = xnb.k(new StringBuilder("+"), X1.phone, f78.f());
                        } else {
                            M02 = ob6.M0(2131747559, null);
                        }
                    }
                    if (i != vn8Var.s - 1) {
                        z2 = true;
                    }
                    lj6Var.c(X1, null, M02, z2);
                    return;
                }
                return;
            }
            TLRPC.Chat M03 = vn8Var.getMessagesController().M0(Long.valueOf(-keyAt));
            if (M03 != null) {
                int i3 = M03.participants_count;
                if (i3 != 0) {
                    M0 = ob6.G(i3, "Members", new Object[0]);
                } else if (M03.has_geo) {
                    M0 = ob6.M0(2131748396, null);
                } else if (!xc2.t0(M03)) {
                    M0 = ob6.M0(2131748395, null);
                } else {
                    M0 = ob6.M0(2131748392, null);
                }
                if (i != vn8Var.s - 1) {
                    z2 = true;
                }
                lj6Var.c(M03, null, M0, z2);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        mf5 mf5Var;
        FrameLayout ilbVar;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        mf5 mf5Var2 = new mf5(this.c, aob.L6, 21, 11, false, null);
                        mf5Var2.setHeight(43);
                        mf5Var = mf5Var2;
                    } else {
                        skb skbVar = new skb(viewGroup.getContext());
                        skbVar.k(ob6.M0(2131747642, null), false);
                        skbVar.g(-1, aob.p7);
                        mf5Var = skbVar;
                    }
                } else {
                    ilbVar = new ij6(context);
                }
            } else {
                ilbVar = new ilb(context);
            }
            mf5Var = ilbVar;
        } else {
            lj6 lj6Var = new lj6(this.c, 7, 6, true, null);
            lj6Var.setDelegate(new jz7(this, (byte) 16));
            mf5Var = lj6Var;
        }
        return new f89(mf5Var);
    }
}
