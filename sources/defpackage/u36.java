package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
public final class u36 implements View.OnClickListener {
    public final byte a;
    public final l46 b;

    public u36(l46 l46Var, byte b) {
        this.a = b;
        this.b = l46Var;
    }

    @Override
    public final void onClick(View view) {
        long j;
        byte b = this.a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                hl.g(l46Var.c1());
                l46Var.dismiss();
                return;
            case 1:
                a46 a46Var = l46Var.z2;
                if (a46Var.r) {
                    a46Var.h.performClick();
                    return;
                } else {
                    a46Var.w.performClick();
                    return;
                }
            case 2:
                a46 a46Var2 = l46Var.z2;
                if (a46Var2.r) {
                    a46Var2.h.performClick();
                    return;
                } else {
                    a46Var2.w.performClick();
                    return;
                }
            default:
                l46 l46Var2 = this.b;
                int i = l46Var2.c2;
                HashSet hashSet = l46Var2.t2;
                if (l46Var2.e2) {
                    e eVar = l46Var2.F2;
                    if (eVar != 0) {
                        ?? obj = new Object();
                        obj.a = true;
                        eVar.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
                    } else {
                        return;
                    }
                } else if (i == 19 || i == 32 || l46Var2.k1()) {
                    wg1 wg1Var = l46Var2.X1;
                    if (wg1Var.a) {
                        l46Var2.z2.w.callOnClick();
                        wg1 wg1Var2 = l46Var2.X1;
                        if (wg1Var2.d && wg1Var2.l) {
                            w36 w36Var = new w36(l46Var2, (byte) 1);
                            if (wg1Var2.e) {
                                j = 300;
                            } else {
                                j = 0;
                            }
                            hl.d3(w36Var, j);
                            return;
                        }
                        return;
                    } else if (wg1Var.d && on0.k() && !l46Var2.X1.m) {
                        ym0.i(l46Var2.V1, l46Var2);
                        return;
                    } else {
                        l46Var2.dismiss();
                        return;
                    }
                }
                if (i != 11 && i != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i == 2) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                l46Var2.d2.add((TLRPC.Chat) it.next());
                            }
                            l46Var2.p1(arrayList);
                            return;
                        } else if (i == 5) {
                            TLRPC.User X1 = uc7.s1(l46Var2.a).X1(Long.valueOf(yac.h(l46Var2.a).e()));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((TLRPC.Chat) it2.next());
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l46Var2.J0, l46Var2.getContext());
                            String G = ob6.G(arrayList2.size(), "LeaveCommunities", new Object[0]);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = G;
                            if (arrayList2.size() == 1) {
                                idVar.U = hl.S2(ob6.a0("ChannelLeaveAlertWithName", null, 2131752361, ((TLRPC.Chat) arrayList2.get(0)).title));
                            } else {
                                idVar.U = hl.S2(ob6.a0("ChatsLeaveAlert", null, 2131752141, new Object[0]));
                            }
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.j(ob6.M0(2131743016, null), new fu2(l46Var2, arrayList2, X1, false, (byte) 15));
                            idVar.show();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, l46Var2.J0);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (hashSet.isEmpty()) {
                    l46Var2.dismiss();
                    return;
                } else {
                    l46Var2.q1(null);
                    return;
                }
        }
    }
}
