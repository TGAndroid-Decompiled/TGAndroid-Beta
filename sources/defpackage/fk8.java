package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class fk8 extends n39 {
    public final Context c;
    public final gk8 d;

    public fk8(gk8 gk8Var, Context context) {
        this.d = gk8Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
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
        gk8 gk8Var = this.d;
        if (i == gk8Var.x) {
            return 4;
        }
        if (i == gk8Var.n) {
            return 3;
        }
        if (i == gk8Var.f) {
            return 2;
        }
        if (i != gk8Var.h && i != gk8Var.w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        String M0;
        String M02;
        gk8 gk8Var = this.d;
        boolean z = gk8Var.E;
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ld5 ld5Var = (ld5) view;
                        if (i == gk8Var.n) {
                            if (z) {
                                ld5Var.setText(k96.G(gk8Var.getMessagesController().y0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                ld5Var.setText(k96.M0(2131746649, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                dh6 dh6Var = (dh6) view;
                dh6Var.a(bkb.u6, bkb.t6);
                if (z) {
                    dh6Var.b(2131232104, 5, k96.M0(2131753689, null), false);
                    return;
                } else {
                    k96.M0(2131746677, null);
                    throw null;
                }
            }
            mhb mhbVar = (mhb) view;
            if (i == gk8Var.h) {
                if (z) {
                    mhbVar.setFixedSize(0);
                    mhbVar.setText(k96.M0(2131753674, null));
                    return;
                }
                mhbVar.setFixedSize(8);
                mhbVar.setText(null);
                return;
            } else if (i == gk8Var.w) {
                mhbVar.setFixedSize(12);
                mhbVar.setText("");
                return;
            } else {
                return;
            }
        }
        gh6 gh6Var = (gh6) view;
        if (z) {
            long keyAt = gk8Var.getMessagesController().x0.keyAt(i - gk8Var.r);
            gh6Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User V1 = gk8Var.getMessagesController().V1(Long.valueOf(keyAt));
                if (V1 != null) {
                    if (V1.bot) {
                        M02 = k96.M0(2131753153, null).substring(0, 1).toUpperCase() + k96.M0(2131753153, null).substring(1);
                    } else {
                        String str = V1.phone;
                        if (str != null && str.length() != 0) {
                            M02 = yjb.k(new StringBuilder("+"), V1.phone, p38.f());
                        } else {
                            M02 = k96.M0(2131747639, null);
                        }
                    }
                    if (i != gk8Var.s - 1) {
                        z2 = true;
                    }
                    gh6Var.c(V1, null, M02, z2);
                    return;
                }
                return;
            }
            TLRPC.Chat K0 = gk8Var.getMessagesController().K0(Long.valueOf(-keyAt));
            if (K0 != null) {
                int i3 = K0.participants_count;
                if (i3 != 0) {
                    M0 = k96.G(i3, "Members", new Object[0]);
                } else if (K0.has_geo) {
                    M0 = k96.M0(2131748450, null);
                } else if (!hc2.t0(K0)) {
                    M0 = k96.M0(2131748449, null);
                } else {
                    M0 = k96.M0(2131748446, null);
                }
                if (i != gk8Var.s - 1) {
                    z2 = true;
                }
                gh6Var.c(K0, null, M0, z2);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ld5 ld5Var;
        FrameLayout mhbVar;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        ld5 ld5Var2 = new ld5(this.c, bkb.K6, 21, 11, false, null);
                        ld5Var2.setHeight(43);
                        ld5Var = ld5Var2;
                    } else {
                        wgb wgbVar = new wgb(viewGroup.getContext());
                        wgbVar.k(k96.M0(2131747722, null), false);
                        wgbVar.g(-1, bkb.o7);
                        ld5Var = wgbVar;
                    }
                } else {
                    mhbVar = new dh6(context);
                }
            } else {
                mhbVar = new mhb(context);
            }
            ld5Var = mhbVar;
        } else {
            gh6 gh6Var = new gh6(this.c, 7, 6, true, null);
            gh6Var.setDelegate(new k88(this, (byte) 9));
            ld5Var = gh6Var;
        }
        return new s49(ld5Var);
    }
}
