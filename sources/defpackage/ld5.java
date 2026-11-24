package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ld5 extends q59 {
    public final Context c;
    public final pd5 d;

    public ld5(pd5 pd5Var, Context context) {
        this.d = pd5Var;
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
        View view = u69Var.a;
        if (!(view instanceof ij6) || !this.d.Z1.contains(Long.valueOf(((ij6) view).getUserId()))) {
            int i = u69Var.f;
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
        pd5 pd5Var = this.d;
        if (i < pd5Var.e2 || i >= pd5Var.f2) {
            if (i < pd5Var.h2 || i >= pd5Var.i2) {
                if (i == pd5Var.c2) {
                    return 1;
                }
                if (i != pd5Var.j2 && i != pd5Var.g2) {
                    if (i == 0) {
                        return 3;
                    }
                    if (i == pd5Var.d2) {
                        return 4;
                    }
                    if (i == pd5Var.k2) {
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
    public final void t(u69 u69Var, int i) {
        TLObject tLObject;
        int i2;
        long j;
        pd5 pd5Var = this.d;
        ArrayList arrayList = pd5Var.R1;
        int i3 = u69Var.f;
        View view = u69Var.a;
        boolean z = false;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    l55 l55Var = (l55) view;
                    if (i == pd5Var.j2) {
                        l55Var.setText(jb6.M0(2131752278, null));
                        return;
                    } else if (i == pd5Var.g2) {
                        if (pd5Var.b2) {
                            l55Var.setText(jb6.M0(2131742488, null));
                            return;
                        } else {
                            l55Var.setText(jb6.M0(2131749213, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            fj6 fj6Var = (fj6) view;
            if (i == pd5Var.c2) {
                if ((!pd5Var.W1 || pd5Var.X1) && pd5Var.j2 == -1 && !arrayList.isEmpty()) {
                    z = true;
                }
                fj6Var.b(2131232209, 7, jb6.M0(2131743074, null), z);
                return;
            }
            return;
        }
        ij6 ij6Var = (ij6) view;
        ij6Var.setTag(Integer.valueOf(i));
        int i4 = pd5Var.e2;
        if (i >= i4 && i < pd5Var.f2) {
            tLObject = (TLObject) arrayList.get(i - i4);
        } else {
            int i5 = pd5Var.h2;
            if (i >= i5 && i < pd5Var.i2) {
                tLObject = (TLObject) pd5Var.S1.get(i - i5);
            } else {
                tLObject = null;
            }
        }
        if (i < pd5Var.e2 || i >= (i2 = pd5Var.f2)) {
            i2 = pd5Var.i2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j = ((TLRPC.User) tLObject).id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j = k47.B1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User W1 = oc7.r1(pd5Var.a).W1(Long.valueOf(j));
        if (W1 != null) {
            ij6Var.setCustomImageVisible(pd5Var.Z1.contains(Long.valueOf(W1.id)));
            if (i != i2 - 1) {
                z = true;
            }
            ij6Var.c(W1, null, null, z);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ij6 ij6Var;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            ij6Var = new View(context);
                        } else {
                            ?? tk4Var = new tk4(context, null);
                            tk4Var.setViewType(6);
                            tk4Var.setIsSingleCell(true);
                            tk4Var.e(cmb.Vg, cmb.Hh, cmb.Zg);
                            ij6Var = tk4Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new g69(-1, gm.L(56.0f)));
                        ij6Var = view;
                    }
                } else {
                    ?? l55Var = new l55(context, null);
                    anb.h(cmb.Zg, null, l55Var);
                    l55Var.setTextColor(cmb.Gh);
                    ij6Var = l55Var;
                }
            } else {
                ?? fj6Var = new fj6(context);
                int i2 = cmb.fh;
                fj6Var.a(i2, i2);
                fj6Var.setDividerColor(cmb.Wg);
                ij6Var = fj6Var;
            }
        } else {
            ij6 ij6Var2 = new ij6(this.c, 6, 2, false, null);
            ij6Var2.setCustomRightImage(2131232198);
            ij6Var2.setNameColor(cmb.w0(null, cmb.dh, false));
            int w0 = cmb.w0(null, cmb.bh, false);
            int w02 = cmb.w0(null, cmb.fh, false);
            ij6Var2.P = true;
            ij6Var2.I = w0;
            ij6Var2.J = w02;
            ij6Var2.setDividerColor(cmb.Wg);
            ij6Var = ij6Var2;
        }
        return new u69(ij6Var);
    }
}
