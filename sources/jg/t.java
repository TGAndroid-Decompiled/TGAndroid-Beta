package jg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.hw;
import org.telegram.ui.ww;
public final class t implements f0, dj0 {
    public final h0 f16922a;

    public t(h0 h0Var) {
        this.f16922a = h0Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.f16922a;
        int i7 = h0Var.f16757s0;
        h0Var.f16758t0 = arrayList;
        h0Var.f16764x0 = hVar;
        for (int i10 = 0; i10 < h0Var.f16758t0.size(); i10++) {
            g0 g0Var = (g0) h0Var.f16758t0.get(i10);
            TLObject tLObject = g0Var.f16724a;
            if (tLObject instanceof TLRPC.User) {
                qp.s1(i7).X3((TLRPC.User) g0Var.f16724a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                qp.s1(i7).Q3((TLRPC.Chat) g0Var.f16724a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                qp.s1(i7).U3((TLRPC.EncryptedChat) g0Var.f16724a, true);
            }
        }
        h0Var.G(null);
        h0Var.f();
    }

    @Override
    public boolean c(int i7, View view) {
        TLRPC.User a22;
        hw hwVar = this.f16922a.U;
        if (hwVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            ww wwVar = hwVar.f46503a;
            if (wwVar.getParentActivity() != null && (a22 = wwVar.getMessagesController().a2(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wwVar.getParentActivity());
                String M0 = hd.M0(2131752234, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(hd.a0("ChatHintsDeleteAlert", null, 2131752235, g5.m(0, a22.first_name, a22.last_name)));
                alertDialog$Builder.k(hd.M0(2131744856, null), new di.c1(hwVar, longValue, 8));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                wwVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    r6.V(textView, k6.f28090q7, wwVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
