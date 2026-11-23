package jg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.bx;
import org.telegram.ui.lw;
public final class s implements f0, sj0 {
    public final h0 f17743a;

    public s(h0 h0Var) {
        this.f17743a = h0Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.f17743a;
        int i7 = h0Var.f17586t0;
        h0Var.f17587u0 = arrayList;
        h0Var.f17594y0 = hVar;
        for (int i10 = 0; i10 < h0Var.f17587u0.size(); i10++) {
            g0 g0Var = (g0) h0Var.f17587u0.get(i10);
            TLObject tLObject = g0Var.f17556a;
            if (tLObject instanceof TLRPC.User) {
                mp.u1(i7).e4((TLRPC.User) g0Var.f17556a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                mp.u1(i7).X3((TLRPC.Chat) g0Var.f17556a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                mp.u1(i7).b4((TLRPC.EncryptedChat) g0Var.f17556a, true);
            }
        }
        h0Var.G(null);
        h0Var.f();
    }

    @Override
    public boolean b(int i7, View view) {
        TLRPC.User c22;
        lw lwVar = this.f17743a.V;
        if (lwVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            bx bxVar = lwVar.f49849a;
            if (bxVar.getParentActivity() != null && (c22 = bxVar.getMessagesController().c2(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bxVar.getParentActivity());
                String N0 = gd.N0(2131752222, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(gd.a0("ChatHintsDeleteAlert", null, 2131752223, i5.m(0, c22.first_name, c22.last_name)));
                alertDialog$Builder.k(gd.N0(2131744614, null), new ai.z(lwVar, longValue, 9));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                bxVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    u6.U(textView, n6.f29692q7, bxVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
