package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class q16 implements View.OnClickListener {
    public final byte a;
    public final h26 b;

    public q16(h26 h26Var, byte b) {
        this.a = b;
        this.b = h26Var;
    }

    @Override
    public final void onClick(View view) {
        long j;
        byte b = this.a;
        h26 h26Var = this.b;
        switch (b) {
            case 0:
                gl.g(h26Var.b1());
                h26Var.dismiss();
                return;
            case 1:
                w16 w16Var = h26Var.z2;
                if (w16Var.r) {
                    w16Var.h.performClick();
                    return;
                } else {
                    w16Var.w.performClick();
                    return;
                }
            case 2:
                w16 w16Var2 = h26Var.z2;
                if (w16Var2.r) {
                    w16Var2.h.performClick();
                    return;
                } else {
                    w16Var2.w.performClick();
                    return;
                }
            default:
                h26 h26Var2 = this.b;
                int i = h26Var2.c2;
                HashSet hashSet = h26Var2.t2;
                if (h26Var2.e2) {
                    d dVar = h26Var2.F2;
                    if (dVar != 0) {
                        ?? obj = new Object();
                        obj.a = true;
                        dVar.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
                    } else {
                        return;
                    }
                } else if (i == 19 || i == 32 || h26Var2.j1()) {
                    ng1 ng1Var = h26Var2.X1;
                    if (ng1Var.a) {
                        h26Var2.z2.w.callOnClick();
                        ng1 ng1Var2 = h26Var2.X1;
                        if (ng1Var2.d && ng1Var2.l) {
                            s16 s16Var = new s16(h26Var2, (byte) 1);
                            if (ng1Var2.e) {
                                j = 300;
                            } else {
                                j = 0;
                            }
                            gl.e3(s16Var, j);
                            return;
                        }
                        return;
                    } else if (ng1Var.d && on0.k() && !h26Var2.X1.m) {
                        ym0.i(h26Var2.V1, h26Var2);
                        return;
                    } else {
                        h26Var2.dismiss();
                        return;
                    }
                }
                if (i != 11 && i != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i == 2) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                h26Var2.d2.add((TLRPC.Chat) it.next());
                            }
                            h26Var2.o1(arrayList);
                            return;
                        } else if (i == 5) {
                            TLRPC.User V1 = na7.q1(h26Var2.a).V1(Long.valueOf(y6c.h(h26Var2.a).e()));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((TLRPC.Chat) it2.next());
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h26Var2.J0, h26Var2.getContext());
                            String G = k96.G(arrayList2.size(), "LeaveCommunities", new Object[0]);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = G;
                            if (arrayList2.size() == 1) {
                                hdVar.U = gl.T2(k96.a0("ChannelLeaveAlertWithName", null, 2131752377, ((TLRPC.Chat) arrayList2.get(0)).title));
                            } else {
                                hdVar.U = gl.T2(k96.a0("ChatsLeaveAlert", null, 2131752164, new Object[0]));
                            }
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.j(k96.M0(2131743122, null), new lt2(h26Var2, arrayList2, V1, false, (byte) 15));
                            hdVar.show();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, h26Var2.J0);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (hashSet.isEmpty()) {
                    h26Var2.dismiss();
                    return;
                } else {
                    h26Var2.p1(null);
                    return;
                }
        }
    }
}
