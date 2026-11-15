package jg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.jw;
import org.telegram.ui.yw;
public final class s implements f0, ij0 {
    public final h0 f17264a;

    public s(h0 h0Var) {
        this.f17264a = h0Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.f17264a;
        int i7 = h0Var.f17107t0;
        h0Var.f17108u0 = arrayList;
        h0Var.f17115y0 = hVar;
        for (int i10 = 0; i10 < h0Var.f17108u0.size(); i10++) {
            g0 g0Var = (g0) h0Var.f17108u0.get(i10);
            TLObject tLObject = g0Var.f17077a;
            if (tLObject instanceof TLRPC.User) {
                np.s1(i7).X3((TLRPC.User) g0Var.f17077a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                np.s1(i7).Q3((TLRPC.Chat) g0Var.f17077a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                np.s1(i7).U3((TLRPC.EncryptedChat) g0Var.f17077a, true);
            }
        }
        h0Var.G(null);
        h0Var.f();
    }

    @Override
    public boolean b(int i7, View view) {
        TLRPC.User a22;
        jw jwVar = this.f17264a.V;
        if (jwVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            yw ywVar = jwVar.f48422a;
            if (ywVar.getParentActivity() != null && (a22 = ywVar.getMessagesController().a2(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
                String M0 = hd.M0(2131752234, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.g0.X2(hd.a0("ChatHintsDeleteAlert", null, 2131752235, g5.m(0, a22.first_name, a22.last_name)));
                alertDialog$Builder.k(hd.M0(2131744855, null), new ai.d0(jwVar, longValue, 9));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                ywVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    q6.U(textView, j6.f29090q7, ywVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
