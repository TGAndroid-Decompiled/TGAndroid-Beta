package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od5 extends c79 {
    public final Context c;
    public final sd5 d;

    public od5(sd5 sd5Var, Context context) {
        this.d = sd5Var;
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
        View view = f89Var.a;
        if (!(view instanceof lj6) || !this.d.Z1.contains(Long.valueOf(((lj6) view).getUserId()))) {
            int i = f89Var.f;
            if (i == 0 || i == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.l2;
    }

    @Override
    public final int d(int i) {
        sd5 sd5Var = this.d;
        if (i < sd5Var.e2 || i >= sd5Var.f2) {
            if (i < sd5Var.h2 || i >= sd5Var.i2) {
                if (i == sd5Var.c2) {
                    return 1;
                }
                if (i != sd5Var.j2 && i != sd5Var.g2) {
                    if (i == 0) {
                        return 3;
                    }
                    if (i == sd5Var.d2) {
                        return 4;
                    }
                    if (i == sd5Var.k2) {
                        return 5;
                    }
                    return 0;
                }
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        TLObject tLObject;
        int i2;
        long j;
        sd5 sd5Var = this.d;
        ArrayList arrayList = sd5Var.R1;
        int i3 = f89Var.f;
        View view = f89Var.a;
        boolean z = false;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    p55 p55Var = (p55) view;
                    if (i == sd5Var.j2) {
                        p55Var.setText(ob6.M0(2131752306, null));
                        return;
                    } else if (i == sd5Var.g2) {
                        if (sd5Var.b2) {
                            p55Var.setText(ob6.M0(2131742456, null));
                            return;
                        } else {
                            p55Var.setText(ob6.M0(2131749210, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            ij6 ij6Var = (ij6) view;
            if (i == sd5Var.c2) {
                if ((!sd5Var.W1 || sd5Var.X1) && sd5Var.j2 == -1 && !arrayList.isEmpty()) {
                    z = true;
                }
                ij6Var.b(2131232208, 7, ob6.M0(2131743042, null), z);
                return;
            }
            return;
        }
        lj6 lj6Var = (lj6) view;
        lj6Var.setTag(Integer.valueOf(i));
        int i4 = sd5Var.e2;
        if (i >= i4 && i < sd5Var.f2) {
            tLObject = (TLObject) arrayList.get(i - i4);
        } else {
            int i5 = sd5Var.h2;
            if (i >= i5 && i < sd5Var.i2) {
                tLObject = (TLObject) sd5Var.S1.get(i - i5);
            } else {
                tLObject = null;
            }
        }
        if (i < sd5Var.e2 || i >= (i2 = sd5Var.f2)) {
            i2 = sd5Var.i2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j = ((TLRPC.User) tLObject).id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j = r47.B1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User X1 = uc7.s1(sd5Var.a).X1(Long.valueOf(j));
        if (X1 != null) {
            lj6Var.setCustomImageVisible(sd5Var.Z1.contains(Long.valueOf(X1.id)));
            if (i != i2 - 1) {
                z = true;
            }
            lj6Var.c(X1, null, null, z);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        lj6 lj6Var;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            lj6Var = new View(context);
                        } else {
                            ?? tk4Var = new tk4(context, null);
                            tk4Var.setViewType(6);
                            tk4Var.setIsSingleCell(true);
                            tk4Var.e(aob.Wg, aob.Ih, aob.ah);
                            lj6Var = tk4Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new r79(-1, hl.L(56.0f)));
                        lj6Var = view;
                    }
                } else {
                    ?? p55Var = new p55(context, null);
                    yob.h(aob.ah, null, p55Var);
                    p55Var.setTextColor(aob.Hh);
                    lj6Var = p55Var;
                }
            } else {
                ?? ij6Var = new ij6(context);
                int i2 = aob.gh;
                ij6Var.a(i2, i2);
                ij6Var.setDividerColor(aob.Xg);
                lj6Var = ij6Var;
            }
        } else {
            lj6 lj6Var2 = new lj6(this.c, 6, 2, false, null);
            lj6Var2.setCustomRightImage(2131232197);
            lj6Var2.setNameColor(aob.w0(null, aob.eh, false));
            int w0 = aob.w0(null, aob.ch, false);
            int w02 = aob.w0(null, aob.gh, false);
            lj6Var2.P = true;
            lj6Var2.I = w0;
            lj6Var2.J = w02;
            lj6Var2.setDividerColor(aob.Xg);
            lj6Var = lj6Var2;
        }
        return new f89(lj6Var);
    }
}
