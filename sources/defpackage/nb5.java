package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nb5 extends n39 {
    public final Context c;
    public final rb5 d;

    public nb5(rb5 rb5Var, Context context) {
        this.d = rb5Var;
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
        View view = s49Var.a;
        if (!(view instanceof gh6) || !this.d.Z1.contains(Long.valueOf(((gh6) view).getUserId()))) {
            int i = s49Var.f;
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
        rb5 rb5Var = this.d;
        if (i < rb5Var.e2 || i >= rb5Var.f2) {
            if (i < rb5Var.h2 || i >= rb5Var.i2) {
                if (i == rb5Var.c2) {
                    return 1;
                }
                if (i != rb5Var.j2 && i != rb5Var.g2) {
                    if (i == 0) {
                        return 3;
                    }
                    if (i == rb5Var.d2) {
                        return 4;
                    }
                    if (i == rb5Var.k2) {
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
    public final void t(s49 s49Var, int i) {
        TLObject tLObject;
        int i2;
        long j;
        rb5 rb5Var = this.d;
        ArrayList arrayList = rb5Var.R1;
        int i3 = s49Var.f;
        View view = s49Var.a;
        boolean z = false;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    l35 l35Var = (l35) view;
                    if (i == rb5Var.j2) {
                        l35Var.setText(k96.M0(2131752324, null));
                        return;
                    } else if (i == rb5Var.g2) {
                        if (rb5Var.b2) {
                            l35Var.setText(k96.M0(2131742562, null));
                            return;
                        } else {
                            l35Var.setText(k96.M0(2131749264, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            dh6 dh6Var = (dh6) view;
            if (i == rb5Var.c2) {
                if ((!rb5Var.W1 || rb5Var.X1) && rb5Var.j2 == -1 && !arrayList.isEmpty()) {
                    z = true;
                }
                dh6Var.b(2131232208, 7, k96.M0(2131743148, null), z);
                return;
            }
            return;
        }
        gh6 gh6Var = (gh6) view;
        gh6Var.setTag(Integer.valueOf(i));
        int i4 = rb5Var.e2;
        if (i >= i4 && i < rb5Var.f2) {
            tLObject = (TLObject) arrayList.get(i - i4);
        } else {
            int i5 = rb5Var.h2;
            if (i >= i5 && i < rb5Var.i2) {
                tLObject = (TLObject) rb5Var.S1.get(i - i5);
            } else {
                tLObject = null;
            }
        }
        if (i < rb5Var.e2 || i >= (i2 = rb5Var.f2)) {
            i2 = rb5Var.i2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j = ((TLRPC.User) tLObject).id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j = k27.B1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User V1 = na7.q1(rb5Var.a).V1(Long.valueOf(j));
        if (V1 != null) {
            gh6Var.setCustomImageVisible(rb5Var.Z1.contains(Long.valueOf(V1.id)));
            if (i != i2 - 1) {
                z = true;
            }
            gh6Var.c(V1, null, null, z);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        gh6 gh6Var;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            gh6Var = new View(context);
                        } else {
                            ?? pi4Var = new pi4(context, null);
                            pi4Var.setViewType(6);
                            pi4Var.setIsSingleCell(true);
                            pi4Var.e(bkb.Vg, bkb.Hh, bkb.Zg);
                            gh6Var = pi4Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new e49(-1, gl.L(56.0f)));
                        gh6Var = view;
                    }
                } else {
                    ?? l35Var = new l35(context, null);
                    zkb.h(bkb.Zg, null, l35Var);
                    l35Var.setTextColor(bkb.Gh);
                    gh6Var = l35Var;
                }
            } else {
                ?? dh6Var = new dh6(context);
                int i2 = bkb.fh;
                dh6Var.a(i2, i2);
                dh6Var.setDividerColor(bkb.Wg);
                gh6Var = dh6Var;
            }
        } else {
            gh6 gh6Var2 = new gh6(this.c, 6, 2, false, null);
            gh6Var2.setCustomRightImage(2131232197);
            gh6Var2.setNameColor(bkb.w0(null, bkb.dh, false));
            int w0 = bkb.w0(null, bkb.bh, false);
            int w02 = bkb.w0(null, bkb.fh, false);
            gh6Var2.P = true;
            gh6Var2.I = w0;
            gh6Var2.J = w02;
            gh6Var2.setDividerColor(bkb.Wg);
            gh6Var = gh6Var2;
        }
        return new s49(gh6Var);
    }
}
