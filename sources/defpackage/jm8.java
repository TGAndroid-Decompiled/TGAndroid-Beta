package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class jm8 extends q59 {
    public final Context c;
    public final km8 d;

    public jm8(km8 km8Var, Context context) {
        this.d = km8Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        km8 km8Var = this.d;
        if (i == km8Var.x) {
            return 4;
        }
        if (i == km8Var.n) {
            return 3;
        }
        if (i == km8Var.f) {
            return 2;
        }
        if (i != km8Var.h && i != km8Var.w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        String M0;
        String M02;
        km8 km8Var = this.d;
        boolean z = km8Var.E;
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        jf5 jf5Var = (jf5) view;
                        if (i == km8Var.n) {
                            if (z) {
                                jf5Var.setText(jb6.G(km8Var.getMessagesController().y0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                jf5Var.setText(jb6.M0(2131746575, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                fj6 fj6Var = (fj6) view;
                fj6Var.a(cmb.u6, cmb.t6);
                if (z) {
                    fj6Var.b(2131232105, 5, jb6.M0(2131753657, null), false);
                    return;
                } else {
                    jb6.M0(2131746603, null);
                    throw null;
                }
            }
            njb njbVar = (njb) view;
            if (i == km8Var.h) {
                if (z) {
                    njbVar.setFixedSize(0);
                    njbVar.setText(jb6.M0(2131753642, null));
                    return;
                }
                njbVar.setFixedSize(8);
                njbVar.setText(null);
                return;
            } else if (i == km8Var.w) {
                njbVar.setFixedSize(12);
                njbVar.setText("");
                return;
            } else {
                return;
            }
        }
        ij6 ij6Var = (ij6) view;
        if (z) {
            long keyAt = km8Var.getMessagesController().x0.keyAt(i - km8Var.r);
            ij6Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User W1 = km8Var.getMessagesController().W1(Long.valueOf(keyAt));
                if (W1 != null) {
                    if (W1.bot) {
                        M02 = jb6.M0(2131753121, null).substring(0, 1).toUpperCase() + jb6.M0(2131753121, null).substring(1);
                    } else {
                        String str = W1.phone;
                        if (str != null && str.length() != 0) {
                            M02 = mlb.l(new StringBuilder("+"), W1.phone, r58.f());
                        } else {
                            M02 = jb6.M0(2131747565, null);
                        }
                    }
                    if (i != km8Var.s - 1) {
                        z2 = true;
                    }
                    ij6Var.c(W1, null, M02, z2);
                    return;
                }
                return;
            }
            TLRPC.Chat L0 = km8Var.getMessagesController().L0(Long.valueOf(-keyAt));
            if (L0 != null) {
                int i3 = L0.participants_count;
                if (i3 != 0) {
                    M0 = jb6.G(i3, "Members", new Object[0]);
                } else if (L0.has_geo) {
                    M0 = jb6.M0(2131748399, null);
                } else if (!sd2.t0(L0)) {
                    M0 = jb6.M0(2131748398, null);
                } else {
                    M0 = jb6.M0(2131748395, null);
                }
                if (i != km8Var.s - 1) {
                    z2 = true;
                }
                ij6Var.c(L0, null, M0, z2);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        jf5 jf5Var;
        FrameLayout njbVar;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        jf5 jf5Var2 = new jf5(this.c, cmb.K6, 21, 11, false, null);
                        jf5Var2.setHeight(43);
                        jf5Var = jf5Var2;
                    } else {
                        xib xibVar = new xib(viewGroup.getContext());
                        xibVar.k(jb6.M0(2131747648, null), false);
                        xibVar.g(-1, cmb.o7);
                        jf5Var = xibVar;
                    }
                } else {
                    njbVar = new fj6(context);
                }
            } else {
                njbVar = new njb(context);
            }
            jf5Var = njbVar;
        } else {
            ij6 ij6Var = new ij6(this.c, 7, 6, true, null);
            ij6Var.setDelegate(new h68(this, (byte) 13));
            jf5Var = ij6Var;
        }
        return new u69(jf5Var);
    }
}
