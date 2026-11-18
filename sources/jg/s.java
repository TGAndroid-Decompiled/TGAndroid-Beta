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
import org.telegram.ui.Components.qj0;
import org.telegram.ui.cx;
import org.telegram.ui.mw;
public final class s implements f0, qj0 {
    public final h0 f17647a;

    public s(h0 h0Var) {
        this.f17647a = h0Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.f17647a;
        int i7 = h0Var.f17490t0;
        h0Var.f17491u0 = arrayList;
        h0Var.f17498y0 = hVar;
        for (int i10 = 0; i10 < h0Var.f17491u0.size(); i10++) {
            g0 g0Var = (g0) h0Var.f17491u0.get(i10);
            TLObject tLObject = g0Var.f17460a;
            if (tLObject instanceof TLRPC.User) {
                mp.u1(i7).e4((TLRPC.User) g0Var.f17460a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                mp.u1(i7).X3((TLRPC.Chat) g0Var.f17460a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                mp.u1(i7).b4((TLRPC.EncryptedChat) g0Var.f17460a, true);
            }
        }
        h0Var.G(null);
        h0Var.f();
    }

    @Override
    public boolean c(int i7, View view) {
        TLRPC.User c22;
        mw mwVar = this.f17647a.V;
        if (mwVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            cx cxVar = mwVar.f49953a;
            if (cxVar.getParentActivity() != null && (c22 = cxVar.getMessagesController().c2(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
                String M0 = gd.M0(2131752223, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.g0.W2(gd.a0("ChatHintsDeleteAlert", null, 2131752224, i5.m(0, c22.first_name, c22.last_name)));
                alertDialog$Builder.k(gd.M0(2131744620, null), new ai.d0(mwVar, longValue, 9));
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                cxVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    u6.U(textView, n6.f29635q7, cxVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
