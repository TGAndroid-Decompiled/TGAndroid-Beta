package kg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.h3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.PremiumPreviewFragment;
public final class y implements View.OnClickListener {
    public final int f11336a;
    public final q0 f11337b;

    public y(q0 q0Var, int i10) {
        this.f11336a = i10;
        this.f11337b = q0Var;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        int i10 = this.f11336a;
        q0 q0Var = this.f11337b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g(q0Var.k1());
                q0Var.dismiss();
                return;
            case 1:
                e0 e0Var = q0Var.f11247w2;
                if (e0Var.f11330r) {
                    e0Var.h.performClick();
                    return;
                } else {
                    e0Var.f11332w.performClick();
                    return;
                }
            case 2:
                e0 e0Var2 = q0Var.f11247w2;
                if (e0Var2.f11330r) {
                    e0Var2.h.performClick();
                    return;
                } else {
                    e0Var2.f11332w.performClick();
                    return;
                }
            default:
                int i11 = q0Var.Z1;
                HashSet hashSet = q0Var.f11241q2;
                if (q0Var.f11226b2) {
                    org.telegram.ui.ActionBar.k2 k2Var = q0Var.C2;
                    if (k2Var != 0) {
                        ?? obj = new Object();
                        obj.f20390a = true;
                        k2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
                    } else {
                        return;
                    }
                } else if (i11 == 19 || i11 == 32 || q0Var.s1()) {
                    h3 h3Var = q0Var.U1;
                    if (h3Var.f16005a) {
                        q0Var.f11247w2.f11332w.callOnClick();
                        h3 h3Var2 = q0Var.U1;
                        if (h3Var2.d && h3Var2.f16013l) {
                            a0 a0Var = new a0(q0Var, 1);
                            if (h3Var2.e) {
                                j10 = 300;
                            } else {
                                j10 = 0;
                            }
                            org.telegram.messenger.i0.h3(a0Var, j10);
                            return;
                        }
                        return;
                    } else if (h3Var.d && mg.k0.i() && !q0Var.U1.f16014m) {
                        mg.p.i(q0Var.S1, q0Var);
                        return;
                    } else {
                        q0Var.dismiss();
                        return;
                    }
                }
                if (i11 != 11 && i11 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i11 == 2) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                q0Var.a2.add((TLRPC.Chat) it.next());
                            }
                            q0Var.x1(arrayList);
                            return;
                        } else if (i11 == 5) {
                            TLRPC.User Z1 = wp.r1(q0Var.f21584a).Z1(Long.valueOf(e20.i(q0Var.f21584a).e()));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((TLRPC.Chat) it2.next());
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q0Var.getContext(), q0Var.I0);
                            String G = dd.G(arrayList2.size(), "LeaveCommunities", new Object[0]);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = G;
                            if (arrayList2.size() == 1) {
                                x1Var.T = org.telegram.messenger.i0.W2(dd.a0("ChannelLeaveAlertWithName", null, 2131752389, ((TLRPC.Chat) arrayList2.get(0)).title));
                            } else {
                                x1Var.T = org.telegram.messenger.i0.W2(dd.a0("ChatsLeaveAlert", null, 2131752176, new Object[0]));
                            }
                            alertDialog$Builder.h(dd.L0(2131752589, null), null);
                            alertDialog$Builder.k(dd.L0(2131743390, null), new androidx.car.app.utils.a(q0Var, arrayList2, Z1, 5));
                            x1Var.show();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                a7.V(textView, t6.f21171q7, q0Var.I0);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (hashSet.isEmpty()) {
                    q0Var.dismiss();
                    return;
                } else {
                    q0Var.y1(null);
                    return;
                }
        }
    }
}
