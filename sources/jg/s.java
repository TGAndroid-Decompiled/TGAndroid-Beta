package jg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.cx;
import org.telegram.ui.mw;
public final class s implements f0, sj0 {
    public final h0 f17675a;

    public s(h0 h0Var) {
        this.f17675a = h0Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.f17675a;
        int i7 = h0Var.f17518t0;
        h0Var.f17519u0 = arrayList;
        h0Var.f17526y0 = hVar;
        for (int i10 = 0; i10 < h0Var.f17519u0.size(); i10++) {
            g0 g0Var = (g0) h0Var.f17519u0.get(i10);
            TLObject tLObject = g0Var.f17488a;
            if (tLObject instanceof TLRPC.User) {
                np.u1(i7).e4((TLRPC.User) g0Var.f17488a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                np.u1(i7).X3((TLRPC.Chat) g0Var.f17488a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                np.u1(i7).b4((TLRPC.EncryptedChat) g0Var.f17488a, true);
            }
        }
        h0Var.G(null);
        h0Var.f();
    }

    @Override
    public boolean c(int i7, View view) {
        TLRPC.User c22;
        mw mwVar = this.f17675a.V;
        if (mwVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            cx cxVar = mwVar.f49998a;
            if (cxVar.getParentActivity() != null && (c22 = cxVar.getMessagesController().c2(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
                String N0 = hd.N0(2131752222, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(hd.a0("ChatHintsDeleteAlert", null, 2131752223, i5.m(0, c22.first_name, c22.last_name)));
                alertDialog$Builder.k(hd.N0(2131744612, null), new ai.d0(mwVar, longValue, 9));
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                cxVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    t6.U(textView, m6.f29622q7, cxVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
